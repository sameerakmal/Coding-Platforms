import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1729A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int fa = a - 1;
            int fb = Math.abs(b-c);
            int fbc = Math.abs(c - 1) + fb;
            if(fa < fbc) System.out.println(1);
            else if(fa > fbc) System.out.println(2);
            else System.out.println(3);
        }
        
        scan.close();
    }
}