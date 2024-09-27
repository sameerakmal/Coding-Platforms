import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long d = scan.nextLong();
        if(a + b - c == d || a - b + c == d || a + b * c == d || a * b + c == d || a * b - c == d || a - b * c == d ) System.out.println("YES");
        else System.out.println("NO");
        


        
        scan.close();
    }
}