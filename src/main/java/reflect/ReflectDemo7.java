package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("reflect.Person");
        Method[] methods  = cls.getDeclaredMethods();
        for(Method m:methods){
            //System.out.println(m);
            System.out.println("方法名："+m.getName());//获取方法名
            System.out.println("参数个数"+m.getParameterCount());//参数个数
//            System.out.println(m.getModifiers());
            int modifiers = m.getModifiers();//获取范围声明
            switch (modifiers){
                case Modifier.PUBLIC:
                    System.out.println("public");
                    break;
                case Modifier.PRIVATE:
                    System.out.println("private");
                    break;
                case Modifier.PROTECTED:
                    System.out.println("protected");

            }
            System.out.println("--------------------------------");
        }

//        System.out.println(Modifier.PROTECTED+Modifier.PRIVATE);
    }
}
