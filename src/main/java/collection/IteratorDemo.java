package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c= new ArrayList<String>();
        c.add("b");
        c.add("a");
        c.add("c");
        c.add("c");
        c.add("#");
        c.add("#");
        c.add("d");
        c.add("e");

        Iterator<String> it = c.iterator();//迭代器遍历
        while (it.hasNext()){//遍历
            String e = it.next();
            if("#".equals(e)){//自变量放前面，变量放后面。若调用的字符串为空NULL，会空指针异常
                //c.remove(e);//迭代器快速失败原则,迭代器要求遍历过程中不可以通过集合的方法增删元素，否则会抛出异常
                it.remove();
            }else {System.out.println(e);}




        }


    }
}
