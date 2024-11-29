import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1348A {
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
            int p1 = 0, p2 = 0;
            
            p1 += Math.pow(2,n);

            for (int i = 1; i < n; i++) {
                if(i < n / 2) p1 += Math.pow(2, i);
                else p2 += Math.pow(2, i);
            }
            System.out.println(Math.abs(p1 - p2));
        }
        
        scan.close();
    }
}