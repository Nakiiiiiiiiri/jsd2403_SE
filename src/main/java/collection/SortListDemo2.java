package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(30, 40));
        list.add(new Point(20, 30));
        list.add(new Point(40, 50));
        list.add(new Point(10, 20));

        System.out.println(list);

        //当调用某个API时，它要求我们为其修改其他的额外代码，称为侵入性，不利于程序后期维护

        Comparator<Point> comparator = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
                int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
                return len1 - len2;
            }
        };Collections.sort(list, comparator);  System.out.println(list);
    }


}



