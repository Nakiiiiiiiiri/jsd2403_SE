package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        /*Method[] method = cls.getDeclaredMethods();
        for(Method m:method){
            System.out.println(m.getName());
        }*/
        Method method = cls.getDeclaredMethod("hehe");
        method.setAccessible(true);//强行打开访问权限，反射的暴力访问
        method.invoke(obj);
        method.setAccessible(false);//和流一样用完关上
    }
}
