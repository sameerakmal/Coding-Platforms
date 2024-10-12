import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1472B {
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
            int cnt1 = 0;
            int cnt2 = 0;
            
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                if(num == 2) cnt2++;
                else cnt1++;
            }
            
            int tw = cnt1 + 2 * cnt2;
            
            if (tw % 2 == 0) {
                int hw = tw / 2;
                
                if (hw % 2 == 0 || (cnt1 > 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
        
        scan.close();
    }
}
