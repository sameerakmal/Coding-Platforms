import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1512A {
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
            
            int[] checkArr = new int[n];
            System.arraycopy(arr, 0, checkArr, 0, n);
            Arrays.sort(checkArr);
            int odd = 0;
            if(checkArr[0] != checkArr[1]) odd = checkArr[0];
            else odd = checkArr[n-1];

            for (int i = 0; i < n; i++) {
                if(odd == arr[i]){
                    System.out.println(i + 1);
                }
            }

            
        }
        
        scan.close();
    }
}