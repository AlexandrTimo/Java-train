package scan_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sc_file {

    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "C:/Users/Liventz/Desktop/example_scan.txt";
        String fileName = "C:/projects/tranning/Java/advance+/scan_file/example.txt";

        File textFile = new File(fileName);
        
        Scanner input = new Scanner(textFile);

        int value = input.nextInt();
        System.out.println("Here is " + value + " words");
        input.nextLine();

        int count = 2;
        while(input.hasNextLine()){
            String line = input.nextLine();
                System.out.println(count + ": " + line);
                count++;
        }

        input.close();
    }
}
