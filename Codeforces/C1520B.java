import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1520B {
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
            int count = 0;
            
            for (int d = 1; d <= 9; d++) {
                long ordinary = d;
                while (ordinary <= n) {
                    count++;
                    ordinary = ordinary * 10 + d;
                }
            }
            
            System.out.println(count);
        }
        
        scan.close();
    }
}