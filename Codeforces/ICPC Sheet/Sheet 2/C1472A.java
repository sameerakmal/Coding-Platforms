import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1472A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int w = scan.nextInt();
            int h = scan.nextInt();
            int n = scan.nextInt();
            int sum = 0;
            if(w % 2 == 0) sum += w;
            if(h % 2 == 0) sum += h;

            if(w + h >= n || n == 1) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scan.close();
    }
}