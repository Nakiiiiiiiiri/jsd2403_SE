package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p = new Person();
        p.say("您好");
        p.say("呵呵",5);//循环次数

        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method method = cls.getMethod("say",String.class);
        method.invoke(obj,"大家好");





    }
}
