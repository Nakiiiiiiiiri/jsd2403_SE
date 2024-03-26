package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("fos.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] date = new byte[(int)file.length()];
        fis.read(date);//date必须是byte类型
        System.out.println(new String(date, StandardCharsets.UTF_8));
        fis.close();
    }
}
