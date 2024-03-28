package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "刘备";
        int age = 30;
        char gender = '男';
        String[] otherinfo = {"英姿美貌", "英才英俊"};
        Person p = new Person(name, age, gender, otherinfo);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("写出完毕");
        oos.close();
    }
}
