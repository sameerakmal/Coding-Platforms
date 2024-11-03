import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1878A {
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
            int k = scan.nextInt();
            int[] arr = new int[n];
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if(k == arr[i]){
                    found = true;
                    break;
                }
            }
            if(found) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scan.close();
    }
}