import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1294A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int n = scan.nextInt();
            int max = Math.max(a, Math.max(b, c));
            int maxrem = (max - a) + (max - b) + (max - c);
            if(n-maxrem >= 0 && (n - maxrem) % 3 == 0) System.out.println("YES");
            else System.out.println("NO"); 
        }
        
        scan.close();
    }
}