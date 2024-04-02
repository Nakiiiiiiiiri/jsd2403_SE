package reflect;

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scan = new Scanner(System.in);
        Person p = new Person();
        System.out.println(p);
        System.out.println("请输入一个类名");
        String name = scan.next();
        Class cls = Class.forName(name);
        Object obj = cls.newInstance();
        System.out.println(obj);
    }
}
