import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1345 {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        // Your logic goes here, using 'scan' to read input
        
        scan.close();
    }
}