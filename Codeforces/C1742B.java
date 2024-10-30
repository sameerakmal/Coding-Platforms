import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C1742B {
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
            boolean pre = true;
            for(int i = 0; i < arr.length-1;i++){
                if(arr[i] == arr[i+1]){
                    pre = false;
                    break;
                }
            }
            if(pre) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scan.close();
    }
}