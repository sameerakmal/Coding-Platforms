import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1850C {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        for(int i = 1; i <= 5; i++){
            for(int j = 1; )
        }
        
        scan.close();
    }
}