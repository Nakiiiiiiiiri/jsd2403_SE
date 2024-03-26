package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.dat");
        int d = fis.read();
        System.out.println(d);
        d= fis.read();
        System.out.println(d);
        d= fis.read();
        System.out.println(d);//读到文件末尾是-1,前有-1和256同时出现 似乎会失效，这条默认，默认持续输出最后一位
        d= fis.read();
        System.out.println(d);
        d= fis.read();
        System.out.println(d);
        fis.close();
        System.out.println(d);
        fis.close();



    }


}
