package warpper;

public class IntegerDemo2 {
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        System.out.println(imax);
        System.out.println(imin);//int的最大最小型

        double dmax = Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        System.out.println(dmax);
        System.out.println(dmin);

        //包装类可以将字符串转换为对应的基本类型
        String s = "123.123";
        /*int i = Integer.parseInt(s);//异常，int收纳不了，不会舍弃精度会直接产生异常
        System.out.println(i)*/;
        double d = Double.parseDouble(s);
        System.out.println(d);
    }
}
