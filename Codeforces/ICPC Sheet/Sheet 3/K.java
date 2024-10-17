import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int size = scan.nextInt();
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            
            sum += n % 10;
            n = n/10;
        }
        System.out.println(sum);
        
        scan.close();
    }
}