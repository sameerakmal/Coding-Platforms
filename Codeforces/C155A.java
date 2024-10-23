import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C155A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int cnt = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
                cnt++;
            }
            if(arr[i] < min){
                min = arr[i];
                cnt++;
            }

        }
        System.out.println(cnt);
        
        
        scan.close();
    }
}