package io;

import java.io.*;

public class oisDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person p = (Person) ois.readObject();
        System.out.println(p);
        System.out.println("读取成功");
        ois.close();
    }
}
