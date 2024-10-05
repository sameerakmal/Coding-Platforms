import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1829A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            String inp = scan.next();
            String giv = "codeforces";
            int cnt = 0;
            for (int i = 0; i < 10; i++) {
                if(inp.charAt(i) != giv.charAt(i)) cnt++;
            }
            System.out.println(cnt);


        }
        
        scan.close();
    }
}