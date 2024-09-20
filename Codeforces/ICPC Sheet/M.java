import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int ch = scan.next().charAt(0);
        if(ch >= 48 && ch <= 58) System.out.println("IS DIGIT");
        else{
            System.out.println("ALPHA");
            if(ch >= 97) System.out.println("IS SMALL");
            else System.out.println("IS CAPITAL");
        }
        
        scan.close();
    }
}