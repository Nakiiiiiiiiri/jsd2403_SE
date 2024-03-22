package string.zhengze;
import java.util.Arrays;

//切分 正则表达式
public class SplitDemo {
    public static void main(String[] args){
        String line = "abc123efg456ghi789";
        String[] words = line.split("[0-9]+");
        System.out.println(Arrays.toString(words));
        System.out.println("--------------------------------------");
        line = "==abc==def==ghi========";//遇到等号转换为空字符
        words = line.split("=");//字符串最开始是可拆分项目，拆出的第一项是 空字符
        //如果字符串连续出现了可拆分项时，它们之间会拆分出一个空字符串
        //如果字符串末尾连续出现可拆分项，那么末尾所有拆分出来的空字符串都会被舍弃
        System.out.println(Arrays.toString(words));
        words = line.split("=",2);//可以重载
        System.out.println(Arrays.toString(words));
        words = line.split("=",5);//
        System.out.println(Arrays.toString(words));
        words = line.split("=",50);//
        System.out.println(Arrays.toString(words));
        words = line.split("=",0);//与words = line.split(regex)效果一直
        System.out.println(Arrays.toString(words));
        words = line.split("=",-1);//能拆多少拆多少，应拆尽拆
        System.out.println(Arrays.toString(words));


        System.out.println("--------------------------");

        line = "abc.def.ghi";
        words = line.split("\\.");//正则表达式"."是任意字符需要"\"引用,同时"\"也需要"\"引用所以写成"\\."
        System.out.println(Arrays.toString(words));




    }
}
