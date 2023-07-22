import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

class YongAgeException extends RuntimeException{
    YongAgeException(String msg){
        super(msg);
    }
}
public class ExeptionHendling {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = new FileInputStream("E:/abc.txt");
    }
}

