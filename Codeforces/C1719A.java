import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1719A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            String ch = scan.next();
            String co = "codeforces";
            if(co.contains(ch)) System.out.println("YES");
            else System.out.println("NO");
        }     
        scan.close();
    }
}