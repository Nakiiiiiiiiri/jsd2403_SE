package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        /*name.add("jack");
        name.add("tom");
        name.add("mary");
        name.add("lucy");
        name.add("lily");
        name.add("Lucy");
        name.add("Konata");*/
        //默认比较大小的规则，对于中文没有什么意义
        name.add("刘备");
        name.add("关羽余");
        name.add("张飞天");
        name.add("赵云玩家");
        name.add("曹");
        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);
        Collections.sort(name,(o1,o2)->o1.length()-o2.length());

//        Collections.sort(name, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
        System.out.println(name);

    }
}
