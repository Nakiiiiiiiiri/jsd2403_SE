package file;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        for(int i=0;i<100;i++){
            File file = new File("C:\\Users\\Konata\\IdeaProjects\\jsd2403_SE\\junk\\test"+i+".txt");
            file.createNewFile();

        }
        System.out.println("创建完毕");



    }

}
