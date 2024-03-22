package string.zhengze;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "abc123cde123fgh897";
        String newline = line.replaceAll("[0-9]+","NUMBER");
        System.out.println(newline);
    }
}
