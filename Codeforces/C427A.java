import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C427A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int t = scan.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scan.nextInt();
        }
        int pos = 0;
        int cnt = 0;
        for (int i = 0; i < t; i++) {
            if (arr[i] > 0) {
                pos += arr[i];
            }
            else if (arr[i] == -1 && pos > 0) {
                pos = pos - 1;
            }
            else{
                cnt++;
            }
        }
        System.out.println(cnt);
        scan.close();
    }
}