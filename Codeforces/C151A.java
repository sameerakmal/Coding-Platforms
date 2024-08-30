import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C151A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int p = scan.nextInt();
        int nl = scan.nextInt();
        int np = scan.nextInt();

        int drinks = (k * l)/nl;
        int lime = (c * d);
        int salt = p/np;

        int min = Math.min(drinks, Math.min(lime, salt));

        System.out.println(min/n);


        
        scan.close();
    }
}