package string;
//starts/endswith 判断当前字符串是以什么开始结束的
public class StartsWith {
    public static void main(String[] args) {
        String line = "www.tedu.com";
        boolean starts = line.startsWith("w");
        System.out.println(starts);
        starts = line.startsWith("W");
        System.out.println(starts);
        boolean ends = line.endsWith("com");
        System.out.println(ends);
        ends = line.endsWith("cn");
        System.out.println(ends);



    }
}
