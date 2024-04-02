package reflect;

import reflect.annotations.AutoRunClass;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入类名");
            String className = scan.nextLine();
            Class cls = Class.forName(className);
            boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
            //Field[] field = cls.getDeclaredFields();
            if(mark){
                System.out.println("开始实例化对象");
                Object obj= cls.newInstance();
                System.out.println(obj.toString());
            }else {
                System.out.println("该类没有被标注");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
