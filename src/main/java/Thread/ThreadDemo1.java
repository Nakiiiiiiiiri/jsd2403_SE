package Thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        t2.start();
        t1.start();

    }



}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("线程2："+i);
        }
    }

}
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("线程1："+i);
        }
    }
}
