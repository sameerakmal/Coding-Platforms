import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        float a = scan.nextFloat();
        float aceil = (float)Math.floor(a);
        int intval = (int)a;
        float floatval = a - aceil;
        String format = String.format("%.3f", floatval);
        if(a == aceil) {
            System.out.println("int " + intval);
        }
        else{
            System.out.println("float " + intval + " " + format);
        }
    
        
        scan.close();
    }
}