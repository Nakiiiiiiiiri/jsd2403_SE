package file;

import java.io.File;
import java.io.IOException;

//创造文件
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");

        //file.exists()当前File表示的文件是否已存在，存在则返回true
        if(file.exists()){
            System.out.println("该文件已存在");
        }else {
             file.createNewFile();//

        }
    }
}
