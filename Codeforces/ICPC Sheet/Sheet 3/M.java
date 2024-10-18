import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M {
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
        int maxVal = arr[0];
        int minVal = arr[0];
        int maxIdx = 0;
        int minIdx = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
                maxIdx = i;
            }
            if(arr[i] < minVal){
                minVal = arr[i];
                minIdx = i;
            }
        }
        arr[maxIdx] = minVal;
        arr[minIdx] = maxVal;
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}