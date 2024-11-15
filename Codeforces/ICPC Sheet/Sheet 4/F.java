import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            String w = scan.next();
            if(w.length() <= 10){
                System.out.println(w);
            }
            else{  
                System.out.println(w.charAt(0)+""+(w.length()-2)+""+w.charAt(w.length()-1));
            }
        }
        
        scan.close();
    }
}