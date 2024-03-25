package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };

        Comparator<String > c1 = (String o1, String o2)->{
            return o1.length()-o2.length();
        };


    }
}
