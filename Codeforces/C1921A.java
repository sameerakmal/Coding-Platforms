import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1921A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = 8;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int idx = 0;
            for (int i = 3; i < n; i+=2) {
                if(arr[1] == arr[i]) idx = i-1;
            }
            int s = Math.abs(arr[0] - arr[idx]);
            System.out.println(s * s);

        }
        
        scan.close();
    }
}