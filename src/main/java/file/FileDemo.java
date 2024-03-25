package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //File file = new File("C:\\Users\\Konata\\IdeaProjects\\jsd2403_SE\\demo.txt");
        File file = new File("./demo.txt");
        String name = file.getName();//文件名字
        System.out.println(name);
        long length = file.length();//文件长度
        System.out.println("文件名长度："+length);
        boolean cw = file.canWrite();//检查文件读写权限
        System.out.println("文件是否可写："+cw);
        boolean cr = file.canRead();
        System.out.println("文件是否可读："+cr);
        boolean isHiDDen = file.isHidden();
        System.out.println("文件是否隐藏："+true);


    }
}
