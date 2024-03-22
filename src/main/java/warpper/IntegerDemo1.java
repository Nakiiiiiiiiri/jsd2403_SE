package warpper;
//java的八个基本类型，有别于引用型，不是以"对象"形式存在，因此不具备面向对象特性

public class IntegerDemo1 {
    public static void main(String[] args) {
        int a = 1009;
        /*Integer i1 = new Integer(a);
        Integer i2 = new Integer(a);*/
        //java会自动重写java自带类型的equals方法，因此可以使用equals方法比较两个Integer对象是否相等

        //java推荐将基本类型转换为包装类时,使用包装类的valueOf方法
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(a);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
        //Integer类的构造方法，将int类型的值转换为Integer对象，但仅限于1字节内的int值，超出1字节的int值，会自动转换为long值

        Double d = 3.14;
        Double d1 = Double.valueOf(d);
        Double d2 = Double.valueOf(d);
        System.out.println(d1==d2);//Double不会自动重写
        System.out.println(d1.equals(d2));

        int i = i1.intValue();
        System.out.println(i);
        Long l = i1.longValue();
        System.out.println(l);
        byte b = i1.byteValue();
        System.out.println(b);

    }
}
