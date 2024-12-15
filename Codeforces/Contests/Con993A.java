import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Con993A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println(n-1);
        }
        
        scan.close();
    }
}