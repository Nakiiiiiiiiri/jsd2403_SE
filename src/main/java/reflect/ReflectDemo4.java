package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        Scanner scan = new Scanner(System.in);

//        Person p = new Person("李wu",22);
//        p.sayHi();

        System.out.println("请输入类名");
        String className = scan.nextLine();
        System.out.println("请输入方法名");
        String methodNames = scan.nextLine();


        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodNames);
        method.invoke(obj);

    }
}
