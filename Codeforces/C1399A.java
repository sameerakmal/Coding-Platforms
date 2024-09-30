import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1399A {
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
            Arrays.sort(arr);

            boolean ans = true;
            for (int i = 1; i < n; i++) {
                if(arr[i] - arr[i-1] > 1){
                    ans = false;
                    break;
                }
            }
            if (ans) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        scan.close();
    }
}
