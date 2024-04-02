package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo10 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Method method = cls.getDeclaredMethod("study");
        if(method.isAnnotationPresent(AutoRunMethod.class)){
            System.out.println("方法被标注");
            Object obj = cls.newInstance();
            method.invoke(obj);
        }
        else {
            System.out.println("方法为被标注");
        }
    }
}
