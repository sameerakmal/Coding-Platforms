import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
            int n = scan.nextInt();
            String s = scan.next();
            char[] ans = s.toCharArray();
            Arrays.sort(ans);
            String ans1 = new String(ans);
            System.out.println(ans1);
        scan.close();
    }
}