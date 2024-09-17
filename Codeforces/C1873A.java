import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1873A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            String s = scan.next();
            int cnt = 0;
            if(s.charAt(0) != 'a') cnt++;
            if(s.charAt(1) != 'b') cnt++;
            if(s.charAt(2) != 'c') cnt++;
            if(cnt <= 2) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scan.close();
    }
}