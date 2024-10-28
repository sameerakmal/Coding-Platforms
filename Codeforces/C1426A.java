import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1426A {
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
            int x = scan.nextInt();

            if(n == 1 || n == 2){
                System.out.println(1);
                continue;
            }
            double a = (double)(n-2)/x;
            int ans = (int)Math.ceil(a);
            System.out.println(ans + 1);
        }
       
        
        scan.close();
    }
}