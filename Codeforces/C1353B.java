import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1353B {
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
            int k = scan.nextInt();
            int[] arr = new int[n];
            int[] brr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                brr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(brr);
            for (int i = 0; i < k; i++) {
                if(arr[i] >= brr[n-i-1]) break;
                int temp = arr[i];
                arr[i] = brr[n-i-1];
                brr[n-i-1] = temp;
            }
            System.out.println(Arrays.stream(arr).sum());
        }
        
        scan.close();
    }
}