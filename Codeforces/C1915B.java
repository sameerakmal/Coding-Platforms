import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1915B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            for (int i = 0; i < 3; i++) {
                String s = scan.next();
                if(s.contains("?")){
                    if(s.contains("A")){}
                    else System.out.println("A");
                    if(s.contains("B")){}
                    else System.out.println("B");
                    if(s.contains("C")){}
                    else System.out.println("C");
                }
            }

        }
        
        scan.close();
    }
}