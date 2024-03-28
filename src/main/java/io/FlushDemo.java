package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FlushDemo {//冲水,所有输出流都有这个方法
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "你有没有听见孩子们的悲鸣";
        byte[] date = line.getBytes(StandardCharsets.UTF_8);
        bos.write(date);
        //bos.flush();强制将缓冲流内部数组中已缓存的数据一次性写出，可以防止数据丢失，防止下边忘关，车没给老板
        //聊天软件中发送短消息长消息，可以使用
        System.out.println("写出完毕");
        bos.close();//此处不关会导致不到默认的8k,东西还在车上没给老板，导致直接文本没内容



    }
}
