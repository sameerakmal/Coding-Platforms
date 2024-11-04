import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1760B {
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
            int maxchar = 0;
            for(char c : s.toCharArray()){
                if(c > maxchar){
                    maxchar = c;
                }
            }
            System.out.println(maxchar-96);
        }
        
        scan.close();
    }
}