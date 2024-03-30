package Thread;

public class SyncDemo4 {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer();//默认提供线程安全同步机制
        //StringBuilder sb = new StringBuilder();虽然builder单线程环境下性能比buffer更好但是
        // 多线程环境下不提供线程安全同步机制，不手动同步，可能会遇到两个线程在同一时间扩容缓冲区，触发异常

        Thread t1 = new  Thread(()->{

                for(int i=0;i<1000;i++){
                    sb.append("abc");


            }
        });//lambda
        Thread t2 = new  Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    sb.append("def");
                }

            }
        };
        t1.start();
        t2.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb.length());
        System.out.println(sb);

    }
}

