package file;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2 {
    public static void main(String[] args) {
        //获取当前目录下所有名字"."开头的子项
        File dir = new File(".");
        if(dir.isDirectory()){
            FileFilter Filter = new FileFilter(){
                @Override
                public boolean accept(File file) {
                    return file.getName().startsWith(".");
                }
            };

            File[] subs = dir.listFiles(Filter);
            for(int i=0;i< subs.length;i++){
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }
    }
}
