package Thread;

public class SyncDemo2 {
    public static void main(String[] args) {
        shop shop = new shop();
        Thread t1 = new Thread("Konata"){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread("Kagami"){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();

    }

}
class shop{
    public /*synchronized*/ void buy(){//导致全部排队，在方法上使用时不可选范围
        try {
            Thread t1 = Thread.currentThread();//获取当前方法的线程，可以读取名字等操作
            String name = t1.getName();
            System.out.println(name+"正在挑衣服");
            Thread.sleep(5000);
            synchronized (this){//同步监视器，让线程在这一步排队,写abc无论如何看到都是abc都要排队，换店也要排队
                //写this，如果换了一家店就不用排队了
                //当多个线程存在竞争同一资源的问题，应当看到同一个监视器对象
                //当不存在时，应该看到不同的
                System.out.println(name+"正在试衣服");
                Thread.sleep(5000);
            }

            System.out.println(name+"结账");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    };
    }



