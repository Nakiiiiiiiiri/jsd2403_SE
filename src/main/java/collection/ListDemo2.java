package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        System.out.println(list);
        list.add(2,"2");//重写add
        System.out.println(list);
        String e = (String)list.remove(3);
        list.remove(3);

        System.out.println(list);
        System.out.println("被删除的元素"+e);
    }
}
