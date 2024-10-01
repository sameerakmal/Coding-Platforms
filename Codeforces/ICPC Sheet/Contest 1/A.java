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
        
        double x = scan.nextDouble();
        double p = scan.nextDouble();

        double o = p/(1-(x/100));
        System.out.printf("%.2f",o);
        
        scan.close();
    }
}