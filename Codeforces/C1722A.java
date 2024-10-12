import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1722A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            String s = scan.next();
            // System.out.println(s);
            if(n == 5 && s.contains("T") && s.contains("i") && s.contains("m") && s.contains("u") && s.contains("r")) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scan.close();
    }
}