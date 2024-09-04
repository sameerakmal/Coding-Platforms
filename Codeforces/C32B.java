import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C32B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String s = scan.next();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length();) {
            if(s.charAt(i) == '.'){
                ans.append(0);
                i++;
            }
            else{
                if(s.charAt(i + 1) == '.') ans.append(1);
                else ans.append(2);
                i += 2;
            }
        }
        System.out.println(ans.toString());
        
        scan.close();
    }
}