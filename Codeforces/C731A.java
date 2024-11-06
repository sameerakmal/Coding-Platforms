import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C731A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String s = scan.next();
        String s1 = "a" + s;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = Math.abs(s1.charAt(i) - s1.charAt(i+1));
            int minlen = 26-len;
            sum += Math.min(len, minlen);
        }
        System.out.println(sum);
        
        scan.close();
    }
}