import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1353A {
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
            int m = scan.nextInt();
            if(n == 1) System.out.println(0);
            else if(n == 2) System.out.println(m);
            else System.out.println(m * 2); 
        }
        
        scan.close();
    }
}