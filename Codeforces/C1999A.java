import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1999A {
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
            int sum = 0;
            sum += n % 10;
            n = n / 10;
            sum += n % 10;
            System.out.println(sum);
            
        }
        
        scan.close();
    }
}