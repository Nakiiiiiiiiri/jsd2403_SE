package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/*
*
* ArrayList
* Linklist
* */
public class ListDemo {
    public static void main(String[] args) {
        List<String> ls = new ArrayList();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        System.out.println(ls);
        System.out.println(ls.get(2));//get方法取出对应下标元素
        //List集合可以通过遍历喜爱奥到遍历集合元素的目的
        for(int i=0;i<ls.size();i++){//不存在数组一样的长度，而是尺寸
            System.out.println(ls.get(i));
        }
        String old = ls.get(2);
        ls.set(2,"six");
        //System.out.println(ls.get(2));
        System.out.println(ls);
        System.out.println("被替换的元素："+old);
        System.out.println("------------------------------");
//反转
        /*for(int i=0;i<ls.size()/2;i++){
           String s = ls.get(i);
           s=ls.set(ls.size()-1-i,s);
           ls.set(i,s);
           //合成   ls.set(i,ls.set(ls.size()-1-i,ls.get(i)));
        }*/
        Collections.reverse(ls);

        System.out.println(ls);


    }
}
