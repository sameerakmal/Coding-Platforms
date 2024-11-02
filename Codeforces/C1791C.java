import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1791C {
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
            int cnt = n;
            // System.out.println(s.charAt(n-1)); 

            for (int i = 0; i < n/2; i++) {
                if((s.charAt(i) == '0' && s.charAt(n-i-1) == '1') || (s.charAt(i) == '1' && s.charAt(n-i-1) == '0')) { 
                    cnt-=2;
                }
                else{
                    break;
                }
            }
            System.out.println(cnt);

        }
        
        scan.close();
    }
}