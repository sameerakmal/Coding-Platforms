import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1311A {
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
            int sum = a - b;

            if(a == b) System.out.println(0);
            else if((sum < 0 && sum % 2 != 0) || (sum > 0 && sum % 2 == 0)) System.out.println(1);   
            else System.out.println(2);
        }
        
        scan.close();
    }
}