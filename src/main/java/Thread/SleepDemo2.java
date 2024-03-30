package Thread;

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("开眠");
                try {
                    Thread.sleep(500000);
                } catch (InterruptedException e) {
                    System.out.println("一有动静，我就出剑");
                }
                System.out.println("下雨了");
            }};
        Thread t2 = new Thread(){

            public void run(){
                System.out.println("开始出怪");
                for(int i=0;i<5;i++){
                    try {
                        System.out.println("~~~");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }t1.interrupt();}

        };
        t1.start();
        t2.start();




    }
}
