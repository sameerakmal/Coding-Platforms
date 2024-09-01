import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1703A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();

        while(t > 0){
            String s = scan.next();
            String sL = s.toLowerCase();
            
            if(sL.equals("yes"))
            System.out.println("YES");
            else
            System.out.println("NO");
            
            t--;
        }
        
        scan.close();
    }
}