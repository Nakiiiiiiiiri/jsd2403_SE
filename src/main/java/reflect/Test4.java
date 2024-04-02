package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("reflect.Person");
            Method[] method = cls.getDeclaredMethods();
            for(Method m:method){
                if(m.isAnnotationPresent(AutoRunMethod.class)){
                    System.out.println("方法被标注");
                    Object obj = cls.newInstance();
                    m.invoke(obj);
                }
                else {
                    System.out.println("方法为被标注");
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}
