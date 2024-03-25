package collection;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(100));
        }

        System.out.println(list);;
//        Collections.sort(list);
        Collections.sort(list, new Comparator<Integer>() {//重写从小到大方法
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);

    }
}
