package map;

import java.util.*;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",100);
        map.put("英语",100);
        map.put("物理",90);
        map.put("化学",79);
        System.out.println(map);
        /*map.forEach(
                new BiConsumer<String, Integer>() {
                    @Override
                    public void accept(String s, Integer integer) {
                        System.out.println(s+":"+integer);

                    }
                }
        );*/
//lambda表达式
        map.forEach((k,v)-> System.out.println(k+":"+v));

        Collection<String> c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
         //c.forEach((s)-> System.out.println(s));
        //lambda变种
        c.forEach(
                System.out::println
        );
    }
}
