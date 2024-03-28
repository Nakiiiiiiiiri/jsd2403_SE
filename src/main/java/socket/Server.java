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
            System.out.println("等待客户端连接");
            Socket socket = serverSocket.accept();//accept()方法会阻塞，直到有客户端连接
            System.out.println("客户端连接成功");
            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            int d = in.read();
            System.out.println(d);

            while (true){
                String str=br.readLine();
                System.out.println(str);
                if(str.equalsIgnoreCase("bye")){
                    break;
                }

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Server server = new Server();
        server.start();

    }
}