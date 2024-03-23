package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2{
    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add(new Point(5,6));
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        System.out.println(c);//重写toString


        Point p2 = new Point(3,4);
        boolean b = c.contains(p2);//判断当前集合是否包含参数给定的元素，落包含返回true
        System.out.println("集合是否包含p2:"+b);//重写equals，虽然p2不在集合中，但是数值一样

    }
}
