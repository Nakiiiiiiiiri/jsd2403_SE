package io;
//000000 1byte(字节) 1024byte 1kb
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.jpg");
        FileOutputStream fos = new FileOutputStream("image_cp1.jpg");
        int len =0;
        double start = System.currentTimeMillis();

        byte[] data = new byte[1024*10];//10kb
        while ((len = fis.read(data))!=-1){
            fos.write(data,0,len);//无损复制
            //fos.write(data);
        }
        double end = System.currentTimeMillis();
        System.out.println("复制完毕耗时"+(end-start)/1000+"s");

    }
}
