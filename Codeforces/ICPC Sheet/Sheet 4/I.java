import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String s = scan.next();
        boolean pal = true;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt((s.length()-i)-1)) pal = false;
        }
        System.out.println(pal ? "YES" : "NO");
        
        scan.close();
    }
}