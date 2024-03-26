package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        int read = fis.read();
        System.out.println((char)read);
        /*while (true){
            int d= fis.read();
            if(d==-1)
                break;
            System.out.print((char)d+" ");
        }*/
        int d;
        while(( d= fis.read())!=-1){
            System.out.print((char)d+" ");
        }
        fis.close();


    }
}
