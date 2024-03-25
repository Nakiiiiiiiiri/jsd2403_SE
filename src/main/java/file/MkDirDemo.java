package file;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下创建一个名为demo的目录
        File dir = new File("./a/b/c/d/e/f");//目录一般没有后缀
        if(dir.exists()){
            System.out.println("目录已存在");
        }else{
            dir.mkdirs();//加s创建多级目录，前置目录不存在时自动创建多级目录
            System.out.println("目录创建成功");
        }
        File dira = new File("./a");
        dira.delete();
        if(dira.exists()){
            System.out.println("删除失败");
        }else {
            System.out.println("删除成功");
        }
    }
}
