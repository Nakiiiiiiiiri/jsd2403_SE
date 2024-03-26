package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

//像文件中写入文本数据
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        String line = "迪卢克福建省多了几分乐凯大街法律手段";
        byte[] date = line.getBytes(StandardCharsets.UTF_8);//把字符串转换成字节数组
        fos.write(date);
        System.out.println("写出完毕");
        fos.close();

    }
}
