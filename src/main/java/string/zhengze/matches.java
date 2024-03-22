package string.zhengze;

public class matches {
    public static void main(String[] args) {
        /*
        * 邮箱格式
        * 用户名@域名.后缀
        * [a-zA-Z0-9]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
        *
        * */
        String email = "shinoyashirosama@gmail.com";
        String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";//正则表达式的反斜杠和java中的反斜杠都需要转移，转移冲突
        boolean flag = email.matches(regex);//正则表达式
        System.out.println(flag?"验证通过":"验证不通过");

    }
}
