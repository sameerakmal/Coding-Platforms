import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1520B {
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
            int cnt = 0;
            for(int i = 1; i <= n; i++){
                if(i < 10 || (i % 11 == 0 && i < 100) || (i % 111 == 0 && i < 1000 ) || (i % 1111 == 0 && i < 10000) || (i % 11111 == 0 && i < 100000) || (i % 111111 == 0 && i < 1000000) || (i % 1111111 == 0 && i < 10000000) || (i % 11111111 == 0 && i < 100000000) || (i % 111111111 == 0 && i < 1000000000)){
                    cnt++;
                    // System.out.println(i);
                }
            }
            System.out.println(cnt);
        }
        
        scan.close();
    }
}