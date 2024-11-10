import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1296A {
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
            int sum = 0;
            int oddcnt = 0;
            int evencnt = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] % 2 != 0) oddcnt++;
                else evencnt++;
            }
            if(oddcnt > 0 && (oddcnt % 2 != 0 || evencnt > 0)) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scan.close();
    }
}