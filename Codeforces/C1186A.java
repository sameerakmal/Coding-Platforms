import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1186A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(m >= n && k >= n ? "YES" : "NO");
        
        scan.close();
    }
}