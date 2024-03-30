package Thread;

public class SyncDemo1 {
    public static boolean success1 = false;
    public static boolean success2 = false;

    public static void main(String[] args) {
        int count = 0;
        Bank bank = new Bank();
        while (true){
            count++;

            Thread t1 = new Thread(){//不能用lambda表达式
                public void run(){
                    success1 = bank.getMoney(20000);
                }

            };

            Thread t2 = new Thread(){
                public void run(){
                    success2 = bank.getMoney(20000);
                }

            };
            t1.start();
            t2.start();

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(success2);
            System.out.println(success1);

            if(success2&&success1){
                System.out.println("同时取款成功发生安全问题");
                System.out.println("一共尝试了"+count+"次");
                break;
            }else {
                bank.saveMoney(20000);
                success1=false;
                success2=false;
            }


        }




    }
}
