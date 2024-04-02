package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//利用反射机制调用Person中的本来自己定义的所有无参且公开的方法
public class Test2 {
    public static void main(String[] args)  {
        try {
            Class cls = Class.forName("reflect.Person");
            Method[] methods = cls.getDeclaredMethods();
            for(Method m:methods){
                //System.out.println(m);
                if(m.getParameterCount()==0&&m.getModifiers()== Modifier.PUBLIC){
                    m.invoke(cls.newInstance());
                }

            }
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }


    }
}
