import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1399B {
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
            int[] brr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                brr[i] = scan.nextInt();
            }
            int min1 = Arrays.stream(arr).min().getAsInt();
            int min2 = Arrays.stream(brr).min().getAsInt();
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += Math.max(Math.max(arr[i]-min1, 0) , Math.max(brr[i]-min2, 0)); 
            }
            System.out.println(cnt);
        }
        
        scan.close();
    }
}