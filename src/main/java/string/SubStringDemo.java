package string;
//截取当前字符串中指指定范围的字符，接头不接尾
//java api 中 通常含头不含尾
public class SubStringDemo {
    public static void main(String[] args) {
        ///////////////012345678
        String line = "www.tede.com";
        String sub = line.substring(4,8);
        System.out.println(sub);
        sub = line.substring(4);//重载，单写数字，从输入的数字下标开始，截取到尾
        System.out.println(sub);
    }
}
