package exceptions.exp_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class except_exp1 {
    public static void main(String[] args) throws FileNotFoundException { // <- exception via throws
        
        File fileTxt = new File ("test.txt");

        FileReader fReader = new FileReader(fileTxt);
        
    }
}
