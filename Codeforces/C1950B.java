import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1950B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            
            for (int i = 0; i < n; i++) {
                StringBuilder s = new StringBuilder();
                
                for (int j = 0; j < n; j++) {
                    if ((i + j) % 2 == 0) {
                        s.append("##");
                    } else {
                        s.append("..");
                    }
                }
                System.out.println(s);
                System.out.println(s);
            }
        }
        
        scan.close();
    }
}