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
        while (t-- > 0) {
           StringBuilder ans = new StringBuilder();
           for (int i = 0; i < 8; i++) {
               String s = scan.next();
               for(char c : s.toCharArray()){
                    if(Character.isLetter(c)) ans.append(c);
               }
           }
           System.out.println(ans);
        }
        
        scan.close();
    }
}