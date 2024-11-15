import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C2000A {
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
            String s = String.valueOf(a);
            // System.out.println(s);
            if(s.charAt(0) != '1' || s.charAt(1) != '0' || s.charAt(2) == '0' || (s.charAt(2) == '1' && s.length() == 3)) System.out.println("NO");
            else System.out.println("YES");
        }
        
        scan.close();
    }
}