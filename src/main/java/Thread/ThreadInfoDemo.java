package Thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("主线程"+main);
        showInfo();
    }
    public static void showInfo()
    {
        Thread t = Thread.currentThread();
        System.out.println("运行showInfo的线程是"+t);
        String name = t.getName();
        System.out.println("线程名是"+name);
        long id = t.getId();//非空唯一
        System.out.println("线程id是"+id);
        int priority = t.getPriority();
        System.out.println("线程优先级是"+priority);

        boolean isAlive = t.isAlive();//线程是否还存活
        boolean isDaemon = t.isDaemon();//线程是否为守护线程
        boolean isInterrupted = t.isInterrupted();//线程是否被中断
        System.out.println("线程存活状态是"+isAlive);
        System.out.println("线程是否为守护线程是"+isDaemon);
        System.out.println("线程是否被中断是"+isInterrupted);
    }
}

