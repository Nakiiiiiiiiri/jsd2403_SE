package string;
//从头开始，检索给定字符串在当前字符串中的位置，如果不含则返回-1
public class IndexOfDemo {
    public static void main(String[] args) {
        ///////////////0123456789012345   in在2 5 9
        String line = "thinking in java";
        int index = line.indexOf("in");
        System.out.println(index);;
        int INDEX = line.indexOf("IN");
        System.out.println(INDEX);
        index = line.indexOf("in",3);
        System.out.println(index);
        index = line.indexOf("in",6);
        System.out.println(index);
        index = line.lastIndexOf("in");
        System.out.println(index);


    }
}
