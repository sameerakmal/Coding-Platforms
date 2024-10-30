import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C959A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        if(n % 2 == 0) System.out.println("Mahmoud");
        else System.out.println("Ehab");
        
        scan.close();
    }
}