package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class ReflectDemo11 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        Class cls = Class.forName("reflect.Person");
        Method method = cls.getDeclaredMethod("sleep");
        if(method.isAnnotationPresent(AutoRunMethod.class)){


            AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
            int value = arm.value();
            System.out.println("注解参数值为"+value);
        }
    }
}
