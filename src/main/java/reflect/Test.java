package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Student s = new Student("李明",65,"男");
        System.out.println(s);
        Class cls = Class.forName("reflect.Student");
        Constructor c = cls.getConstructor(String.class, int.class, String.class);
        Object obj = c.newInstance("小丽",20,"女");
        System.out.println(obj);
    }
}
