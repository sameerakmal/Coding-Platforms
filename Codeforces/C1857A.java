import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1857A {
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
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            int fsum = 0;
            int lsum = 0;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if(i < n / 2) fsum += arr[i];
                else lsum += arr[i];
            }
            if(fsum % 2 == 0 && lsum % 2 == 0) System.out.println("YES");
            else if(fsum % 2 != 0 && lsum % 2 != 0) System.out.println("YES");
            else System.out.println("NO"); 
        }
        
        scan.close();
    }
}