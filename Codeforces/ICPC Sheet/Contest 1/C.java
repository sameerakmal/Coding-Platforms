import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        char c = scan.next().charAt(0);
        System.out.println(c == 'z' ? 'a' : ++c);
        
        scan.close();
    }
}