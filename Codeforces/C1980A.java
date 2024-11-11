import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1980A {
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
            int m = scan.nextInt();
            String s = scan.next();
            int[] arr = new int[7];
            for(char c : s.toCharArray()){
                arr[c - 'A']++;
            }
            int ans = 0;
            for(int i = 0; i < 7; i++){
                if(arr[i] < m){
                    ans += (m - arr[i]);
                }
            }
            System.out.println(ans);
        }
        
        scan.close();
    }
}