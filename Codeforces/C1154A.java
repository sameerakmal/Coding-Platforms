import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1154A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        int a = arr[3] - arr[2];
        int b = arr[3] - arr[1];
        int c = arr[3] - arr[0];

        System.out.println(a + " " + b + " " + c);
        
        scan.close();
    }
}