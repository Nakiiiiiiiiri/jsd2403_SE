package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "你有没有听见孩子们的悲鸣";
        byte[] date = line.getBytes(StandardCharsets.UTF_8);
        bos.write(date);
        System.out.println("写出完毕");
        bos.close();//此处不关会导致不到默认的8k直接文本没内容



    }
}
