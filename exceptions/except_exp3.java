package exceptions.exp_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class except_exp3 {
    public static void main(String[] args) {

        // Exceptions
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file!");
        }
    }

    // method with exception
    public static void openFile() throws FileNotFoundException{
        File file1 = new File("test.txt");
        FileReader fReader = new FileReader(file1);
        
    }
}
