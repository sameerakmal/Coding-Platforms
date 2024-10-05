import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1551A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            int c1 = n / 3;
            int c2 = n / 3;
            if(c1 + 2 * c2 == n) System.out.println(c1 + " " + c2);
            else if(c1 + 1 + 2 * c2 == n) System.out.println(c1 + 1 + " " + c2);
            else System.out.println(c1 + " " + (c2 + 1));

        }
        
        scan.close();
    }
}