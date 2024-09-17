import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class C80A {

    public static int[] prime(int m){
        int[] arr = new int[50];
        int cnt = 0;
        for(int i = 0; i < 50; i++){
            if(i < 2) continue;
            boolean pri = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    pri = false;
                    break;
                } 
            }
            // if(pri) System.out.println(i);
            
            if(i >= m && pri){
                arr[cnt] = i;
                cnt++;
            } 
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = prime(m);
        if(arr[1] == n) System.out.println("YES");
        else System.out.println("NO");
        // System.out.println(Arrays.toString(arr));
        scan.close();
    }
}