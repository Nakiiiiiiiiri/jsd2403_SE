package string;
//不修改字符串本身，修改String内部的char数组,默认16位
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str  = "学习java,为了未来";
                      // 0123456  78901
        StringBuilder builder = new StringBuilder(str);
        builder.append("的未来");//向后增加内容
        String s = builder.toString();
        System.out.println(s);
        builder.replace(7,14,"为了能迎来未来存在的未来");
        s= builder.toString();
        System.out.println(s);
        builder.delete(0,7);
        s= builder.toString();
        System.out.println(s);
        builder.insert(0,"速食面!");
        s=builder.toString();
        System.out.println(s);





    }
}
