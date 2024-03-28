package socket;

import java.net.Socket;
//Socket封装了TCP协议的通讯细节，使用他可以喝远端计算机建立网络连接，并基于两条流支持用户通讯
public class Client {
    private Socket socket;
    public Client(){
        try{
            System.out.println("正在连接诶服务端");
            socket = new Socket("127.0.0.1",8088);
            //socket = new Socket("localhost",8088);//127.0.0.1是本机地址也可以写成localhost
            System.out.println("与服务端成功连接");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void start(){}

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}

