package string;

public class Test {
    public static void main(String[] args) {
        String s1 = "www.google.com";
        String  s2 = "https://www.tedu.com";
        String result1 = Sub(s1);
        String result2 = Sub(s2);


    }
    public static String Sub(String s) {
        int address1 = s.indexOf(".");
        int address2 = s.indexOf(".", address1 + 1);
        String result = s.substring(address1+1, address2);
        System.out.println(result);
        return result;
    }


}
