package Thread;
//线程的优先级，1~10.默认为5
//改变优先级可以最大程度改变线程获取时间片的概率，优先级越高，获取时间片的次数越多
public class PriorityDemo {
    public static void main(String[] args) {
        Thread max = new Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("max"+i);
                }
            }

        };
        Thread normal = new  Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("normal"+i);
                }
            }
        };

        Thread min = new  Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("min"+i);
                }
            }
        };
        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
//        normal.setPriority();
        max.start();
        normal.start();
        min.start();


    }



}

