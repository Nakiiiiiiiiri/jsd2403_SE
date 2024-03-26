package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("test.txt");
        for(int i='a';i<='z';i++){
            fos.write(i);
        }

        System.out.println("写出完毕");
    }
}
