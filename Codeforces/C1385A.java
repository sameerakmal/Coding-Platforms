import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1385A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();            
            int y = scan.nextInt();            
            int z = scan.nextInt();     
            System.out.println(Math.max(x, y));       

        }
        
        scan.close();
    }
}