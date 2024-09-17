import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        System.out.print(Math.min(a, Math.min(b, c)) + " ");
        System.out.println(Math.max(a, Math.max(b, c)));
        scan.close();
    }
}