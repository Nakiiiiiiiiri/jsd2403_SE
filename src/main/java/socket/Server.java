package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//聊天室服务端
public class Server {
    private ServerSocket serverSocket;
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

        public ClientHandler(Socket socket){
            this.socket = socket;
            ip = socket.getInetAddress().getHostAddress();
        }
        public void run(){
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String nickname = br.readLine();
                System.out.println("id:"+nickname);



                while (true){

                    String str=br.readLine();
                    System.out.println(ip+nickname+"说:"+str);
                    if("bye".equalsIgnoreCase(str)){
                        break;
                    }
                }
            }catch (IOException e){
                e.printStackTrace();

            }


        }
    }
}
