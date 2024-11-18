import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C935A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) cnt++;
        }
        System.out.println(cnt);
        
        scan.close();
    }
}