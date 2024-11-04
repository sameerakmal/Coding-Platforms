import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1542A {
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
            int[] arr = new int[2*n];
            // boolean evenpair = false;
            for (int i = 0; i < 2*n; i++) {
                arr[i] = scan.nextInt();
            }
            int even = 0;
            int odd = 0;
            for (int i = 0; i < 2*n; i++) {
                if(arr[i] % 2 == 0) even++;
                else odd++;
            }
            if(even == odd) System.out.println("YES");
            else System.out.println("NO");
            
        }
        
        scan.close();
    }
}