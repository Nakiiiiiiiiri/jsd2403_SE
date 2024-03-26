package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.jpg");
        FileOutputStream fos = new FileOutputStream("image_cp.jpg");
        int d ;
        double start = System.currentTimeMillis();
        while((d= fis.read())!=-1){
            fos.write(d);
        }
        double end = System.currentTimeMillis();
        System.out.println("复制完毕耗时"+(end-start)/1000+"s");
        fos.close();
        fis.close();

    }
}
