import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C427A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        
        
        scan.close();
    }
}