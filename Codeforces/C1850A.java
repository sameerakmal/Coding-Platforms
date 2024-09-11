import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class C1850A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if(a + b >= 10) System.out.println("YES");
            else if(c + b >= 10) System.out.println("YES");
            else if(a + c >= 10) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scan.close();
    }
}