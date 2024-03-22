package string;
//gc回收崩溃
//String 不适合频繁变动字符串
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "a";
        for(int i=0;i<10;i++){
            str = str + "a";
            System.out.println(str);
        }


    }
}
