package string;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        String str = "a";
        StringBuilder builder = new StringBuilder();
        //请写一次一百万次的for循环
        for (int i = 0; i < 1000000; i++) {
            builder.append("a");
        }
        System.out.println(builder.toString());
        System.out.println("执行完毕");

    }
}
