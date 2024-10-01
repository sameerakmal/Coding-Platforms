import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int a = scan.nextInt();
        int l = a % 10;
        a = a/10;
        int f = a % 10;
        if(l % f == 0 || f % l == 0) System.out.println("YES");
        else System.out.println("NO");
        
        scan.close();
    }
}