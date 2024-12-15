import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Con993C {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int m = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int sa = m - a;
            int sb = m - b;
            int sl = 0;
            if(sa < 0) sl += 0;
            else sl += sa;
            if(sb < 0) sl += 0;
            else sl += sb;

            int sc = sl - c;
            int ans = 0;
            ans += sa < 0 ? m : a;
            ans += sb < 0 ? m : b;
            ans += sc < 0 ? sl : c;
            System.out.println(ans);
        }
        
        scan.close();
    }
}