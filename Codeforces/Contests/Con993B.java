import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Con993B {
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
            String s = scan.next();
            for(int i = s.length()-1; i >= 0; i--){
                char ch = s.charAt(i);
                if(ch == 'p') ans.append('q');
                else if(ch == 'q') ans.append('p');
                else ans.append('w');
            }
            System.out.println(ans.toString());
        }
        
        
        scan.close();
    }
}