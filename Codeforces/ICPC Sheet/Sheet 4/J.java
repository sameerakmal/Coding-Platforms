import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String s = scan.next();
        int[] ans = new int[26];
        for(char c : s.toCharArray()){
            ans[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
           if(ans[i] > 0) {
                System.out.println((char)(i + 'a')+ " : " + ans[i]);
           }
        }
        scan.close();
    }
}