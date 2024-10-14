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
        
        int t = scan.nextInt();
        long sum = 0;
        while(t-- > 0){
            sum += scan.nextInt();
            
        }
        System.out.println(Math.abs(sum));
        

        scan.close();
    }
}