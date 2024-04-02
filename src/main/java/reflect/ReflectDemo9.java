package reflect;

import reflect.annotations.AutoRunClass;

public class ReflectDemo9 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("reflect.Person");
            boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
            if(mark){
                System.out.println("被标注了");
            }else {
                System.out.println("没被标注");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
