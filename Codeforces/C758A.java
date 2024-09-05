import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C758A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[t-1];
        int cnt = 0;
        for (int i = 0; i < t - 1; i++) {
            cnt += (max - arr[i]);
        }
        System.out.println(cnt);
        
        scan.close();
    }
}