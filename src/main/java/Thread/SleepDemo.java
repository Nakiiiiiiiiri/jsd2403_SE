package Thread;

public class SleepDemo {
    public static void main(String[] args) {
        for(int i=10;i>=0;i--){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("程序结束了");
    }

}
