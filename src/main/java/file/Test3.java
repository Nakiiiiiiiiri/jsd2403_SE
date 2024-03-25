package file;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        for( char i  ='a' ;i<='z';i++){
            //File file = new File("./"+i);
            File file = new File(String.valueOf(i));//和单写i一样，默认在根目录，只是啊将i转为字符
            file.mkdir();
//            file.delete();

        }

    }
}
