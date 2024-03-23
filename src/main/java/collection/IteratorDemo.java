package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c= new HashSet();
        c.add("b");
        c.add("a");
        c.add("c");
        c.add("d");
        c.add("e");

        Iterator<String> it = c.iterator();//迭代器遍历
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);


        }


    }
}
