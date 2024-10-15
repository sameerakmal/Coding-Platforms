import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        
        int si = scan.nextInt();

        int n = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 1; i <= si; i++){
            int s = scan.nextInt();
            if(s < n){  
                n = s;
                idx = i;
            }
        }
        System.out.print(n + " " + idx);




        scan.close();
    }
}