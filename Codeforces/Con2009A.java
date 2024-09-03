import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Con2009A {
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
            int calc = 0;
            int upCalc = 0;
            for (int i = a; i <= b; i++) {
                calc = (i - a) + (b - i);
                if(calc > upCalc){
                    upCalc = calc;
                }
            }
            System.out.println(upCalc);
        }
        
        scan.close();
    }
}