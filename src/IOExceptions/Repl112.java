package IOExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Repl112 {
    public static void print(String str) throws FileNotFoundException {
        FileInputStream abc=new FileInputStream(str);

    }

    public static void main(String[] args) {
        try{print("");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}
