import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1915C {
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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            double sqrt = Math.sqrt(sum);
            System.out.println(sqrt == (int) sqrt ? "YES" : "NO");
        }
        
        scan.close();
    }
}