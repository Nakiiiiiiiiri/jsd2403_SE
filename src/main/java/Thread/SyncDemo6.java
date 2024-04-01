package Thread;

public class SyncDemo6 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread t1 = new Thread(foo::methodA);
        Thread t2 = new Thread(()->foo.methodB());
        t1.start();
        t2.start();


    }

}
class Foo{
    public synchronized void methodA(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"正在执行A方法");
            Thread.sleep(3000);
            System.out.println(t.getName()+"A方法执行完成");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public synchronized void methodB(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"正在执行B方法");
            Thread.sleep(3000);
            System.out.println(t.getName()+"B方法执行完成");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}