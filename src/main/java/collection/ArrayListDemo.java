package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three","four","five"};
        System.out.println(Arrays.toString(array));
        List<String >list = Arrays.asList(array);
        System.out.println(list);
       list.set(0,"six");//修改集合第一个元素相当于修改数组第一个元素
        System.out.println(list);
        System.out.println(Arrays.toString(array));

        array[0]="seven";//修改数组第一个元素相当于修改集合第一个元素
        System.out.println(list);
        System.out.println(Arrays.toString(array));
        //任何会改变数组长度的操作都会异常
        /*list.add("eight");
        System.out.println(list);
        System.out.println(Arrays.toString(array));*/

        List<String> list2= new ArrayList<>(list);
        System.out.println("list2:"+list2);
        list2.add("nine");
        System.out.println("list2:"+list2);



    }
}
