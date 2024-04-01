package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/*反射，允许程序在运行期间，再实例化
* */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类名");
//        Class cls = String.class;
        String classname = scanner.nextLine();

        Class cls = Class.forName(classname);
        String name = cls.getName();
        System.out.println(name);
        name = cls.getSimpleName();
        System.out.println(name);
        name = cls.getCanonicalName();
        System.out.println(name);

        Package p  = cls.getPackage();
        System.out.println(p.getName());

         Method[] methods = cls.getMethods();
        System.out.println(methods.length);
         /*for(int i=0;i<methods.length;i++){
             System.out.println(methods[i]);
         }*/
        for(Method m:methods){
            System.out.println(m.getName());
        }

    }
}
