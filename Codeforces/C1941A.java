import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1941A {
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
            int m = scan.nextInt();
            int k = scan.nextInt();

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
        
            int[] brr = new int[m];
            for (int i = 0; i < m; i++) {
                brr[i] = scan.nextInt();
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(arr[i] + brr[j] <= k) cnt++;
                }
            }
            System.out.println(cnt);
        }
        
        scan.close();
    }
}