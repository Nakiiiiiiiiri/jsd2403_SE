package collection;

import java.util.ArrayList;
import java.util.Collection;

public class NewForDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four\n");
        System.out.println(c);

        for(String e:c){
            System.out.println(e);
        }
        String[] s1 = {"one","two","three","four\n"};
        for(int i=0;i<s1.length;i++){
            String e = s1[i];
            System.out.println(e);
        }
        for(String e:s1){//伪代码
            /*//编译器中实际内容
            * for(int var5 = 0; var5 < var4; ++var5) {
            String e = var9[var5];
            System.out.println(e);
        }
            *
            * */

            System.out.println(e);
        }
    }
}
