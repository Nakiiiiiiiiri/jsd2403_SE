package reflect;

import sun.dc.pr.PRError;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person p = new Person("李四",20);
        System.out.println(p);
        Class cls = Class.forName("reflect.Person");


        Constructor c = cls.getConstructor(String.class,int.class);
        Object obj = c.newInstance("王五",22);
        System.out.println(obj);

    }
}
