import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String s = scan.nextLine();
        int index = s.indexOf('\\');
        if (index != -1) {
            System.out.println(s.substring(0, index));
        } else {
            System.out.println(s);
        }
        
        scan.close();
    }
}
