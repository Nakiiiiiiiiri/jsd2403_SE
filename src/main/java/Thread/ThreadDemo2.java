package Thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //实例化线程要并发执行的任务
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
        //实例化现成
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("MyRunnable 1："+i);
        }
    }
}
class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("MyRunnable 2："+i);
        }
    }
}
