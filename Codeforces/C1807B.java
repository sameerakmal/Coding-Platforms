import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1807B {
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
            int eum = 0;
            int oum = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] % 2 == 0) eum += arr[i];
                else oum += arr[i];
            }
            System.out.println(eum > oum ? "YES" : "NO");
        }
        
        scan.close();
    }
}