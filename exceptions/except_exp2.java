package exceptions.exp_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class except_exp2 {
    public static void main(String[] args) {
        
        //File fileTxt = new File("C:/projects/tranning/Java/advance+/exceptions/test.txt");
        File fileTxt = new File("test.txt");

        // Exception
        try {
            FileReader fReader = new FileReader(fileTxt);
            System.out.println("File loading...");
        } catch (FileNotFoundException e) {
           System.out.println("File not found: " + fileTxt.toString());
        }

        System.out.println("Process end!");

    }
}
