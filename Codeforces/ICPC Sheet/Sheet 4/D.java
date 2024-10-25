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
        
        String A = scan.next();
        String B = scan.next();

        System.out.println(A.length() + " " + B.length());
        System.out.println(A + B);

        String swappedA = B.charAt(0) + A.substring(1);
        String swappedB = A.charAt(0) + B.substring(1);
        
        System.out.println(swappedA + " " + swappedB);

        scan.close();
        
        scan.close();
    }
}