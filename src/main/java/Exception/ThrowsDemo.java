package Exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
    public void doSome() throws IOException, AWTException{

    }
    class SubClass extends ThrowsDemo{
        /*public void doSome() throws IOException, AWTException{}
        public void doSome() throws SQLException{}
        public void doSome() throws FileNotFoundException {}*/

    }
}
