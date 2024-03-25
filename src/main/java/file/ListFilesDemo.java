package file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File(".");
        //boolean is File判断当前File表示的是否是一个实际存在的文件
        if(dir.isDirectory()){
            dir.listFiles();//返回一个数组，获取当前File对象表示的目录中的所有子项，最终以数组的形式返回
            File[] subs = dir.listFiles();
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }

    }
}
