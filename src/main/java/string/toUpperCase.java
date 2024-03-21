package string;

import java.util.Scanner;

//to Upper/Lower case将数组中的英文转为大写/小写
public class toUpperCase {
    public static void main(String[] args) {
        String str = "我爱java";
        String upper = str.toUpperCase();
        System.out.println(upper);
        String lower = str.toLowerCase();
        System.out.println(lower);

        String code = "A78dsB";
        System.out.println("请输入验证码"+code);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        code = code.toLowerCase();
        input = code.toLowerCase();
        System.out.println(code.equals(input));






    }
}
