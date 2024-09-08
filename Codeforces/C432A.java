import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class C432A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int t = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        if(n % 3 != 0){
            n -= n % 3;
        }
        // System.out.println(n);
        int cnt = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i+=3) {
            arr[i] += t;
            arr[i + 1] += t;
            arr[i + 2] += t;
            if(arr[i] <= 5 && arr[i + 1] <= 5 && arr[i + 2] <= 5){
                cnt++;
            }
        
            // System.out.println(i);
        }
        System.out.println(cnt);
        
        scan.close();
    }
}