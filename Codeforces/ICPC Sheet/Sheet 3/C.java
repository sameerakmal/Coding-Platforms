import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] > 0) arr[i] = 1;
            else if(arr[i] < 0) arr[i] = 2;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        

        
        scan.close();
    }
}