package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//建议的记事本工具，将用户数的每行字符串都顺序输入note.exe中，当单独输入exit程序退出
public class Test3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("note.txt");
        Scanner scan = new Scanner(System.in);

        while (true) {
            String str = scan.nextLine();
            byte[] date = str.getBytes(StandardCharsets.UTF_8);
            fos.write(date);
            if (str.equalsIgnoreCase("exit")) {
                break;
            }

        }


    }
}
