package reflect;

import java.lang.reflect.Field;

public class ReflectDemo8 {
    public static void main(String[] args) {
        try {
            Teacher t = new Teacher();
            t.name = "你爹";
            System.out.println(t);

            Class cls = Class.forName("reflect.Teacher");
            Object obj = cls.newInstance();
            Field field =  cls.getDeclaredField("name");
            field.set(obj,"牛牛");
            System.out.println(obj);
            Object value = field.get(obj);
            System.out.println(value);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
