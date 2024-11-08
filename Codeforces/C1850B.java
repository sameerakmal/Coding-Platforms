import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1850B {
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
                if(arr[i] > 10) arr[i] = -1;
                brr[i] = scan.nextInt();
                if(arr[i] == -1) brr[i] = -1;
            }
            int maxidx = 1;
            int max = brr[0];
            for (int i = 1; i < n; i++) {
                if(brr[i] > max) {
                    max = brr[i];
                    maxidx = i+1;
                }
            }
            System.out.println(maxidx);
        }
        
        scan.close();
    }
}