import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1858A {
    public static void main(String[] args) {
        Scanner scan = null;

        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }

        int t = scan.nextInt(); 

        while (t-- > 0) {
            int a = scan.nextInt(); 
            int b = scan.nextInt(); 
            int c = scan.nextInt(); 


            int annaMoves = a + (c + 1) / 2; 
            int katieMoves = b + c / 2;     

            if (annaMoves > katieMoves) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }

        scan.close();
    }
}
