import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(y + " " + x);
        
        scan.close();
    }
}