package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        for(int i=0;i<100;i++)
        {
            File file = new File("C:\\Users\\Konata\\IdeaProjects\\jsd2403_SE\\junk\\test"+i+".txt");
            if(file.exists()){
                file.delete();
                System.out.println("删除完成");

            }else {
                System.out.println("文件不存在");
            }
        }


    }
}
