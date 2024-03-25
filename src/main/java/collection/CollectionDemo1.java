package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//list重复且有序的接口
// ste:
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //Collection c = new HashSet();//Set集合不能放重复元素，自动排序
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("one");
        System.out.println(c.add("one"));//set集合时返回false

        System.out.println(c);



        c.clear();
        System.out.println("size："+c.size());

        System.out.println("是否为空集；"+c.isEmpty());
    }
}
