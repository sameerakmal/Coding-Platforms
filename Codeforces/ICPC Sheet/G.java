import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        long n = scan.nextLong();
        System.out.println(n*(n+1)/2);
        scan.close();
    }
}