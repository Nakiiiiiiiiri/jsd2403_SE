package string;
//new和拼接字符串一定会产生新对象
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";//对象会缓存到  常量池  中
        String s2 = "123abc";//重用对象
        String S1 = "123";
        String S2 = "abc";
        String S3 = S1+S2;//字符串拼接产生新对象
        String s4 = new String("123abc");//new之后产生新对象
        String s5 = "123"+"abc";//加号两侧是字面量时，编译器预计算，将结果替换该表达式到字节码文件中
        String s6 = "123";
        s6+="abc";//编译器不会跨行看
        System.out.printf("s1="+s1+"\ts2="+s2+"\tS3="+S3+"\ts4="+s4+"\ts5="+s5+"\ts6="+s6);
        System.out.println("\n----------------------------------");


        System.out.println("s1==s2:"+(s1==s2));
        System.out.println("s1==s4:"+(s1==s4));
        System.out.println("s1=S3:"+(s1==S3));
        System.out.println("S3=s4:"+(S3==s4));
        System.out.println("s1=s5:"+(s1==s5));
        System.out.println("s1=s6:"+(s1==s6));

    }
}
