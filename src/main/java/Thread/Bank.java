package Thread;

public class Bank {
    private int account = 20000;
    public synchronized boolean getMoney(int money){/*synchronized修饰成同步方法
    多个线程不能再一个同步方法内运行，又先后顺序*/
        int sum = getAccount();//查询余额
        if(sum>=money){//判断余额是否够
            sum=sum-money;
            //在这里如果线程的时间片用完,发生线程切换会出现并发安全问题
            Thread.yield();//一个线程调用该方法后就会立即释放本次剩余时间片,主动在这里放弃时间片用于模拟到这里正好时间片用完了
            saveMoney(sum);
            return true;//允许出钞
        }
            return false;//拒绝出钞

    }
    public int getAccount(){
        return account;
    }
    public void saveMoney(int save){
        this.account=save;
    }}

