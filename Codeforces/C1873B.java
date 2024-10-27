import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1873B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int min = arr[0];
            int idx = 0;
            for (int i = 1; i < n; i++) {
                if(arr[i] < min){
                    min = arr[i];
                    idx = i;
                }
            }
            arr[idx] = min + 1;
            int ans = 1;
            for (int i = 0; i < n; i++) {
                ans = ans * arr[i];
            }
            System.out.println(ans);
        }
        
        scan.close();
    }
}