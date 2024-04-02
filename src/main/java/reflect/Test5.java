package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入类名");
        String className = scan.nextLine();
        Class cls = Class.forName(className);
        Method[] method = cls.getDeclaredMethods();
        for(Method m:method){
            if(m.isAnnotationPresent(AutoRunMethod.class)){
                AutoRunMethod arm = m.getAnnotation(AutoRunMethod.class);
                int value = arm.value();
                for(int i=0;i<value;i++){
                    Object obj = cls.newInstance();
                    m.invoke(obj);
                }

            }
        }

    }
}
