package Exception;
/**
 *  异常处理机制中的try-catch
 *  语法:
 *  try{
 *      程序代码        A计划
 *  }catch(XXXException e){
 *      try中出现XXXException后的解决办法       A计划走不通时的B计划
 *  }
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyDemo2 {

    public static void main(String[] args) {
        FileOutputStream fos = null;//扩大FIleOutputStream类型的作用域，使得在下面的Finally依旧能试用
        try{//原本无视异常，现在开始主动处理，try后面要么跟catch要么跟finally
            fos = new FileOutputStream("fos.dat");//若路径错误,则默认值为NULL，倒下下面的close()空指针异常
            fos.write(1);
        } catch(IOException e){
        System.out.println("IO异常");
    }finally{//finally可以跟在catch后也可以跟在try后
        try{//若出现异常，执行catchB计划，再执行finallyB计划。虚拟机检查到有try catch的异常处理存在便不会异常
            if(fos!=null){//防止空指针无法使用close()异常，当程序处理到异常处理机制中，无论try中的语句是否执行，finally最终都必定执行
                //通常用于close操作
                fos.close();
            }
        }catch (IOException e){
            System.out.println("出错了");
        }

    }
}
}
