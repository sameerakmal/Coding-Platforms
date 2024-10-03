import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1370A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        // int t = scan.nextInt();
        // while(t-- > 0){
        //     int n = scan.nextInt();
        //     int[] arr1 = new int[n];
        //     int[] arr2 = new int[n];
        //     int idx = 0;
        //     for (int i = 1; i <= n; i++) {
        //         arr1[idx] = i;
        //         arr2[idx] = i;
        //         idx++;
        //     }
        //     int max = 0;
        //     for(int i = 0; i < n; i++){
                
        //         for(int j = 0; j < n; j++){
        //             if(arr1[i] == arr2[j]) continue;
        //             else{
        //                 int a = arr1[i];
        //                 int b = arr1[j];
        //                 int d = Math.max(a, b);
        //                 int div = 0;
        //                 for(int k = 1; k <= d; k++){
        //                     if(a % k == 0 && b % k == 0){
        //                         div = k;
        //                     }
        //                 }
        //                 max = Math.max(div, max);
        //             }
        //         }
        //     }
        //     System.out.println(max);
        // }
        int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            System.out.println(n/2);
        }
        
        scan.close();
    }
}