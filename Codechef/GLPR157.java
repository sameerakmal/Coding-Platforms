import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GLPR157 {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            boolean pass = false;
            int cnt = 0;
            while (!pass) {
                pass = true;
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        arr[i] = arr[i + 1];
                        pass = false;
                    }
                }
                if (!pass) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        

        scan.close();
    }
}