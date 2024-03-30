package Thread;
//守护线程,是通过调用线程的SetDaemon设置而转变的
//正常常见线程时，默认都是用户线程，区别在于进程结束时
//
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("Op！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("你赢了");
            }
        };
        Thread jack = new Thread(){
            public void run(){

                while(true){
                    System.out.println("你再骂");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }


        };

        rose.start();
        jack.setDaemon(true);//设为守护线程，当所有用户线程(rose)结束，也会强制死亡
        //时间片并非实时刷新，用户线程死亡，守护线程还要在走完剩下时间片才死亡
        jack.start();
        while (true);

    }
}
