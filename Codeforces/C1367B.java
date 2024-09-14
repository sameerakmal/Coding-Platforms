import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1367B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int size = scan.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }
            int even = 0;
            int odd = 0;
            for (int i = 0; i < size; i++) {
                if(i % 2 == 0 && arr[i] % 2 != 0){
                    even++;
                }
                else if(i % 2 != 0 && arr[i] % 2 == 0){
                    odd++;
                }
            }
            if(even == odd){
                System.out.println(even);
            }
            else{
                System.out.println(-1);
            }
        }
        
        scan.close();
    }
}