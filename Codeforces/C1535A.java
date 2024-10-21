import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1535A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int[] arr = new int[2];
            int[] brr = new int[2];
            for (int i = 0; i < 2; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < 2; i++) {
                brr[i] = scan.nextInt();
            }
            

        }
        
        scan.close();
    }
}