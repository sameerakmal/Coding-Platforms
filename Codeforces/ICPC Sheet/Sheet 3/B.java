import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B {
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
        int s = scan.nextInt();
        int idx = -1;
        for(int i = 0; i < n; i++){
            if(s == arr[i]){
                idx = i;
                break;
            } 
        }
        System.out.println(idx);
        

        
        scan.close();
    }
}