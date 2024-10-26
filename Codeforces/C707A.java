import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C707A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean color = false;
        for (int i = 0; i < n*m; i++) {
            char c = scan.next().charAt(0);
            if(c == 'C' || c == 'M' || c == 'Y'){
                color = true;
                break;
            }
        }
        if(color) System.out.println("#Color");
        else System.out.println("#Black&White");
        
        scan.close();
    }
}