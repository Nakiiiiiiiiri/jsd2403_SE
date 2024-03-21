package string;
//去除字符串两侧的空白字符
public class TrimDemo {
    public static void main(String[] args) {
        String line = "  Hello World ";//tab Hello world 空格
        System.out.println("line:"+line);
        line.trim();//字符串是final，无法被修改
        System.out.println("line:"+line);
        String trim = line.trim();//必须定义一个新的，到缓存池中
        System.out.println("line:" +trim);

    }


}
