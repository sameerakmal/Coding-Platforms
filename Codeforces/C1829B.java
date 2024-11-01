import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1829B {
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
            int maxcnt = 0;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] == 0) cnt++;
                else{
                    maxcnt = Math.max(maxcnt, cnt);
                    cnt = 0;
                }
            }
            System.out.println(Math.max(maxcnt, cnt));
        }
        
        scan.close();
    }
}