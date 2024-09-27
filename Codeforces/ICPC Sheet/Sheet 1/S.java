import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        float a = scan.nextFloat();
        if(a >= 0 && a <= 25) System.out.println("Interval [0,25]");
        else if(a > 25 && a <= 50) System.out.println("Interval (25,50]");
        else if(a > 50 && a <= 75) System.out.println("Interval (50,75]");
        else if(a > 75 && a <= 100) System.out.println("Interval (75,100]");
        else System.out.println("Out of Intervals");

        
        scan.close();
    }
}