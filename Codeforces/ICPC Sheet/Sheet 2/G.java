import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class G {

    // public static int fact(int n){
    //     int val = 0;
    //     if(n == 0) {
    //         return val;
    //     }
    //     else{
    //         return fact(n-1);
    //     }
        
    // }
    
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        // int a = fact(5);
        // System.out.println(a);
        // scan.close();

        int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            long ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = ans * i;
            }
            System.out.println(ans);
        }
    }
}