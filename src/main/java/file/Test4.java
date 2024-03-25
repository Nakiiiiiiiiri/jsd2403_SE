package file;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        for( char i  ='a' ;i<='z';i++){
            //File file = new File("./"+i);
            File file = new File(String.valueOf(i));//和单写i一样，默认在根目录，只是啊将i转为字符
            file.delete();

        }
    }
}
