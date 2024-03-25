package Lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){
            //lambda表达式
            FileFilter Filter = f->f.getName().startsWith(".");


            File[] subs = dir.listFiles(Filter);
            for(int i=0;i< subs.length;i++){
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }

    }
}
