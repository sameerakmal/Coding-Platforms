import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String s1 = scan.next();
        String s2 = scan.next();

        System.out.println(s1.length() + " " + s2.length());
        System.out.println(s1 + " " + s2);
        

        scan.close();
    }
}