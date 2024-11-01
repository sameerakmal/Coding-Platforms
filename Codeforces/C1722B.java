import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1722B {
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
            String s1 = scan.next();
            String s2 = scan.next();
            boolean crct = true;
            for (int i = 0; i < n; i++) {
                if(s1.charAt(i) == s2.charAt(i)) continue;
                else if((s1.charAt(i) == 'B' && s2.charAt(i) == 'G') || (s1.charAt(i) == 'G' && s2.charAt(i) == 'B')) continue;
                else{
                    crct = false;
                    break;
                }
            }
            if(crct) System.out.println("YES");
            else System.out.println("NO");
        }
        
        scan.close();
    }
}