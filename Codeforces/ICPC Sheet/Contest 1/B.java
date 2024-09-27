import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        long a = scan.nextLong();
        long b = scan.nextLong();
        long k = scan.nextLong();
        if(a % k == 0 && b % k == 0) System.out.println("Both");
        else if(a % k == 0) System.out.println("Memo");
        else if(b % k == 0) System.out.println("Momo");
        else System.out.println("No One");

        
        scan.close();
    }
}