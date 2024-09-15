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
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        double result = (double)a / b;
        int c = (int)Math.ceil(result);
        int f = (int)Math.floor(result);
        int r = (int)Math.round(result);


        System.out.println("floor " + a +" / "+ b + " = "+f);
        System.out.println("ceil " + a +" / "+ b + " = "+c);
        System.out.println("round " + a +" / "+ b + " = "+r);
     
        scan.close();
    }
}