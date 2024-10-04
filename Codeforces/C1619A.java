import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class C1619A {
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
            int n = s.length();
            int h = n/2;
            boolean isValid = true;
            if(n == 1) isValid = false;
            for(int i = 0; i < h; i++){
                if((n % 2 != 0) || s.charAt(i) != s.charAt(i+h)){
                    isValid = false;
                    break;
                }
            }
            if(isValid) System.out.println("YES");
            else System.out.println("NO");

        }
        
        scan.close();
    }
}