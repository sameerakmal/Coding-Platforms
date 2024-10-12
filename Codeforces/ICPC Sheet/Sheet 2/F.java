import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();

        for(int i = 1; i <= 12; i++){
            System.out.println(n + " * " + i +  " = " + n * i);
        }
        
        scan.close();
    }
}