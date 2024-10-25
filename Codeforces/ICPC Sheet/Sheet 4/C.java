import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String X = scan.next();
        String Y = scan.next();
        if (X.compareTo(Y) <= 0) {
            System.out.println(X);
        } else {
            System.out.println(Y);
        }
        scan.close();
        
        scan.close();
    }
}