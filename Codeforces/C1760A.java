import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1760A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = scan.nextInt();           
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
        scan.close();
    }
}