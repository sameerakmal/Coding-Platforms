import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1669B {
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
            int num = -1;
            if(n > 2){
                for (int i = 0; i < n-2; i++) {
                    if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2]){
                        num = arr[i];
                        break;
                    }
                }
            }
            else{}
            
            System.out.println(num);
        }
        
        scan.close();
    }
}