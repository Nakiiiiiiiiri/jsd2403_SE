package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        List<String > c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");

        System.out.println(c);
        String[] array  = c.toArray(new String[c.size()]);
        //String[] array  = c.toArray(new String[10]);后面输出空格NULL
        System.out.println(Arrays.toString(array));

    }
}
