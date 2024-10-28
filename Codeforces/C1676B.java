import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1676B {
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

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt(); 
            }
            Arrays.sort(arr);
            int min = arr[0];
            int cnt = 0;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] == min) continue;
                else cnt += arr[i] - min; 
            }
            System.out.println(cnt);
        }

        scan.close();
    }
}