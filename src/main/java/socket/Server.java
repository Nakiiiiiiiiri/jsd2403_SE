package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

//聊天室服务端
public class Server {
    private ServerSocket serverSocket;
    private List<PrintWriter> allOut = new ArrayList<>();
    public Server(){
        try{
            System.out.println("正在启动服务端");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void start(){
        try{
            while (true){
                System.out.println("等待客户端连接");
                Socket socket = serverSocket.accept();//accept()方法会阻塞，直到有客户端连接
                System.out.println("一个新的客户端连接成功");

                ClientHandler handler = new ClientHandler(socket);
                Thread t= new Thread(handler);
                t.start();



            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String ip;

        private String nickname;

        public ClientHandler(Socket socket){
            this.socket = socket;
            ip = socket.getInetAddress().getHostAddress();
        }
        public void run(){
            PrintWriter pw = null;
            try {//接收发过来的数据
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
//给客户端发消息
                OutputStream out =  socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out,StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                 pw = new PrintWriter(bw,true);

                //接收客户端发来的第一行字符作为昵称
                nickname = br.readLine();
                /*将该客户端的输出流存入共享集合中
                synchronized (this)
                要让多个线程不能同时操作这个集合，那么同步监视器必须让多个线程看到的是同一个对象.
                这里不能使用this,因为线程在执行ClientHandler的run方法,因此run方法中
                的这个this是一个ClientHandler的实例,每个线程都在执行各自ClientHandler
                任务的run方法,因此他们看到的ClientHandler并非同一个对象*/
                //由于他们都要操作allOut集合,因此将它作为同步监视器对象是合适的
                //实际开发中我们总是使用临界资源作为同步监视器对象,即:抢谁就锁谁
                synchronized (allOut){
                    allOut.add(pw);
                }

                allOut.add(pw);//将客户端的输出流存入共享集合中
                sendMessage(nickname+"加入聊天室，当前人数"+allOut.size());



                String str;
                while ((str=br.readLine())!=null){

                    //服务端输出客户端传来的消息

                   sendMessage(ip+nickname+"说:"+str);
                    /*System.out.println(ip+nickname+"说:"+str);//用sendMessage替代
                    for(PrintWriter o : allOut){
                        o.println(ip+nickname+"说:"+str);
                    }*/
                    //将消息发回给客户端
                    //pw.println();
                    /*if("bye".equalsIgnoreCase(str)){
                        break;
                    }*/
                }
            }catch (IOException e){
                //可以添加处理客户端异常断开的操作
                System.out.println(e);

            }finally {
                synchronized (allOut){
                    allOut.remove(pw);
                }
                //处理客户端断开连接后的操作

                sendMessage(nickname+"下线了,当前在线人数"+allOut.size());
            }
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
        public  void sendMessage(String message){//将消息发送给所有客户端
            System.out.println(message);
            for(PrintWriter o:allOut){
                o.println(message);
            }

        }
    }
}
