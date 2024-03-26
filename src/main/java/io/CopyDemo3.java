package io;

import java.io.*;

//缓冲流完成文件复制
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis,1024*8);
        FileOutputStream fos = new FileOutputStream("image_cp.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos,1024*8);//缓冲区大小
       // byte[] date= new byte[1024*10];
        int d;
        long start = System.currentTimeMillis();
        while((d=bis.read())!=-1){
            bos.write(d);
        }
        long end =System.currentTimeMillis();
        System.out.println("复制完毕，耗时："+(end-start)+"ms");
        bis.close();
        bos.close();


    }
}
