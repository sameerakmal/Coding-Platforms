import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P3149 {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            int cnt = 0;
            for(int j = 0; j < n; j++){
                int a = scan.nextInt();
                if(a > 0){
                    cnt++;
                }
            }
            if(cnt == 0){
                System.out.println(0);
            }
            else{
                System.out.println(n-cnt);
            }
            
        }
        
        scan.close();
    }
}