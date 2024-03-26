package io;
//文件输出流常用构造器
//FileOutputStream（File file）
//FileOutputStream（String path）

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//文件输出流 管道
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //        File file = new File("./");  手动创建完再创建文件流
//        FileOutputStream fos = new FileOutputStream(file);
        FileOutputStream fos = new FileOutputStream("./fos.dat");//相对路径,文件不存在自动创建
        fos.write(255);
        fos.write(2);
        //fos.write(-1);

        fos.write(99);
        fos.write(97);

        System.out.println("写出完毕");
        fos.close();//释放对文件的读写操作,类似（该文件已被占用，不可操作）


    }
}
