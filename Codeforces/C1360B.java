import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1360B {
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
            Arrays.sort(arr);
            int min = arr[1] - arr[0];
            for (int i = 1; i < n-1; i++) {
                if(arr[i+1] - arr[i] < min) {
                    min = arr[i+1] - arr[i];
                }
            }
            System.out.println(min);
        }
        
        scan.close();
    }
}