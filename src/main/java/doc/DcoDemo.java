package doc;

/**
 *文档注释可以在三个地方使用 类上，方法上(包含构造器)，常量上
 * 在类上使用时，说明当前类的整体功能
 *
 * @author Konata
 * @version 1.0
 * @see java.lang.String
 * @since jdk1.8
 *
 */


// public static final String INFO =
 /**
 *
 * w为用户添加问候语   说明当前方法的作用
 * @param   "name" 给定的用户的名字   解释参数的意义（格式等）
 * @return         带有问候语的字符串    解释返回值是什么
 */
public class DcoDemo {
    public String sayHi(String name){
        return "你好："+name;
    }
}
