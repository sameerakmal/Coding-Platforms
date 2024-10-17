import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        
        int si = scan.nextInt();

        int n = Integer.MAX_VALUE;
        int[] arr = new int[si];
        for (int i = 0; i < si; i++){
            arr[i] = scan.nextInt();
            if(arr[i] < n){  
                n = arr[i];
            }
        }
        int cnt = 0;
        for (int i = 0; i < si; i++) {
            if(n == arr[i]) cnt++;
        }
        if(cnt % 2 != 0) System.out.println("Lucky");
        else System.out.println("Unlucky");
        




        scan.close();
    }
}