import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1389A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            if((2 * l) <= r) System.out.println(l + " " + (2 * l));
            else System.out.println("-1 -1");
        }
        
        scan.close();
    }
}