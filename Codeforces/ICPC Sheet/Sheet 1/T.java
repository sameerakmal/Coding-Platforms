import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class T{
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
        int[] orArr = new int[3];
        System.arraycopy(arr, 0, orArr, 0, 3);
        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(orArr[i]);
        }
        scan.close();
    }
}