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
            String s = scan.next();
            boolean found = false;
            for (int i = 0; i < s.length()-2; i++) {
                if((s.charAt(i) == '0' && s.charAt(i+1) == '1' && s.charAt(i+2) == '0') || (s.charAt(i) == '1' && s.charAt(i+1) == '0' && s.charAt(i+2) == '1')){
                    found = true;
                    break;
                }
                
            }
            if(found) System.out.println("Good");
                else System.out.println("Bad");
        }
        

        
        scan.close();
    }
}