import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1927A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int cnt = 0;
            int first = 0;
            int last = 0;
            for (int i = 0; i < n; i++) {
                if(cnt == 0 && s.charAt(i) == 'B'){
                    cnt++;
                    first = i;
                }
                else if(s.charAt(i) == 'B') last = i;
            }
            if(last == 0){
                System.out.println(1);
            }
            else{
                System.out.println((last - first)+1);
            }
            
        }
        
        scan.close();
    }
}