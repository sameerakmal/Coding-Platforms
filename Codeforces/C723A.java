import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C723A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        System.out.println((arr[1] - arr[0]) + (arr[2] - arr[1]));
        
        scan.close();
    }
}