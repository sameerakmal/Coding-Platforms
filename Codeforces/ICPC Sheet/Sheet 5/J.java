import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int n = scan.nextInt();
        double ans = 0.0;
        for (int i = 0; i < n; i++) {
            ans += scan.nextDouble();
        }
        System.out.printf("%.6f", (ans/n));

        
        scan.close();
    }
}