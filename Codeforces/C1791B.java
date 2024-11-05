import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1791B {
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
            int x = 0;
            int y = 0;
            boolean passed = false;
            for(char c : s.toCharArray()){
                if(c == 'U') y++;
                else if(c == 'D') y--;
                else if(c == 'R') x++;
                else x--;

                if(x == 1 && y == 1){
                    passed = true;
                    break;
                }
            }
            if(passed) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scan.close();
    }
}