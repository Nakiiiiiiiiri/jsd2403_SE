package Exception;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{
            String line = "abc";
            System.out.println(Integer.parseInt(line));
        }catch (Exception e){
            e.printStackTrace();//向控制台输出错误的跟踪信息

            String msg = e.getMessage();
            System.out.println(msg);
        }
        System.out.println("程序结束了");
    }
}
