package warpper;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        int a = 123;
        Integer i =a;
        System.out.println(i);
         int b = i;
        System.out.println(b);

    }
    public static void method(Object i ){
        System.out.println(i);
    }
}
