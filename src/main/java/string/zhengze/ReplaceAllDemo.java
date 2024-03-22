package string.zhengze;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "abc123cde123fgh897";
        String newline = line.replaceAll("[0-9]+","NUMBER");
        System.out.println(newline);

        String regex = "(nmlgb|nc|sb)";
        String message = "nmlgb,你是nc吧，sb";
        String newmessage = message.replaceAll(regex,"***");
        System.out.println(newmessage);


    }
}
