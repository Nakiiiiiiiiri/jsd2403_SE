package Thread;

public class SyncDemo3 {
    public static void main(String[] args) {
//        Boo boo = new Boo();
        Thread t1 =new Thread (()->{Boo.doSome();});
        Thread t2 = new Thread(()->{Boo.doSome();});//れんしゅう
        Thread t3 = new Thread(()->{Boo.doSome();});

        t1.start();
        t2.start();
        t3.start();
    }

}
class Boo{
    public  static void doSome(){//加上static可以不用实例化就能调用
        synchronized(Boo.class){
            try {
            Thread t =Thread.currentThread();
            System.out.println(t.getName()+"正在执行doSome");
            Thread.sleep(2000);
            System.out.println(t.getName()+"执行doSome完毕");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }




    }

}
