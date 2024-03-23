package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
//addAll集合加入某个集合,removeAll集合移除某个集合的内容,retianAll集合与某个集合交集,
// remove集合移除某个元素，containsAll集合是否完全包含
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1"+c1);

        Collection c2 = new HashSet();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        c2.add("php");
        System.out.println("c2："+c2);

        //c1.addAll(c2);//c2元素放到c1中
        c2.addAll(c1);//c2是set重复元素java放不进去
        System.out.println("c1："+c1);
        System.out.println("c2："+c2);

        Collection c3 =new ArrayList();
        c3.add("java");
        c3.add("php");
        c3.add("python");
        c3.retainAll(c2);//c2元素放到c3中取交集
        System.out.println("c3："+c3);

        c3.removeAll(c2);//c3中删除c2，c3共有的元素
        System.out.println("c3:"+c3);

        c3.add("java");
        c3.add("php");
        c3.add("python");
        c3.remove("php");//删除c3中指定元素
        System.out.println("c3:"+c3);

        Collection c4 = new ArrayList();
        c4.add("java");
        c4.add("c++");
        c4.add("android");
        System.out.println("c2完全包含c4："+c2.containsAll(c4));





    }
}
