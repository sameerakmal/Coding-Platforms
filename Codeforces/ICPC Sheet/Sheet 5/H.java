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
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int no = scan.nextInt();
            char ch = scan.next().charAt(0);
            for (int i = 0; i < no; i++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            
        }

        
        scan.close();
    }
}