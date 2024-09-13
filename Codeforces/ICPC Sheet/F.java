import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        long a = scan.nextLong();
        long b = scan.nextLong();
        long la = a % 10;
        long lb = b % 10;
        System.out.println(la + lb);

        
        scan.close();
    }
}