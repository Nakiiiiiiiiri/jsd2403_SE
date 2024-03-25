package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection<Point> c4 = new ArrayList();//加入<Point>，数组集合中只能放Point类型
        Point p = new Point(10, 20);
        c4.add(p);
        /*c4.add("10");
        c4.add(10);
        <Point>的限定*/
        System.out.println("c4"+c4);
        System.out.println("p"+p);
        p.setX(200);
        System.out.println("c4"+c4);//会受影响
        System.out.println("p"+p);
    }
}
