import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1409A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int t = scan.nextInt();
        while(t-- > 0){
            int a = scan.nextInt();
            int b = scan.nextInt();

            int diff = Math.abs(b-a);
            int diff10 =(int)Math.ceil(diff/10.0);

            System.out.println(diff10);

        }
        
        scan.close();
    }
}