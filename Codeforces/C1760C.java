import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1760C {
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
            
            int[] newarr = new int[n];
            System.arraycopy(arr, 0, newarr, 0, n);
            Arrays.sort(newarr);
            int max = newarr[n-1];
            int max2 = newarr[n-2];
            for (int i = 0; i < n; i++) {
                if(max == arr[i]) System.out.print(arr[i] - max2 + " ");
                else System.out.print(arr[i] - max + " ");
            }
            System.out.println();


        }
        
        scan.close();
    }
}