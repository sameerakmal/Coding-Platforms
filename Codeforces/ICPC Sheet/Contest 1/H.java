import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        double n = scan.nextDouble();
        double k = scan.nextDouble();
        double a = scan.nextDouble();

        double cal = (n * k) / a;

        if(cal == Math.floor(cal)) { 
            if(cal >= Integer.MIN_VALUE && cal <= Integer.MAX_VALUE) {
                System.out.println("int");
            } else if(cal >= Long.MIN_VALUE && cal <= Long.MAX_VALUE) {
                System.out.println("long long");
            }
        } else {
            System.out.println("double");
        }

        scan.close();
    }
}
