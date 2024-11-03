import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C702A {
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
        int max = arr[0];
        int cnt = 1;
        int pre = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
                cnt++;
            }
            else{
                if(cnt > pre) pre = cnt;
                max = arr[i];
                cnt = 1;
            }
        }
        System.out.println(pre > cnt ? pre : cnt);
        
        scan.close();
    }
}