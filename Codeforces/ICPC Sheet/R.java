import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        System.out.println( n / 365 + " years" );
        n = n % 365;
        
        System.out.println(n / 30 + " months");
        n = n % 30;

        System.out.println(n + " days");

        scan.close();
    }
}