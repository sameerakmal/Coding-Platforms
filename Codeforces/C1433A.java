import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1433A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int num = scan.nextInt();
            int last = num % 10;
            int cnt = 0;
            while(num != 0){
                num = num / 10;
                cnt++;
            }
            if(cnt == 1) System.out.println((last - 1) * 10 + 1);
            else if(cnt == 2) System.out.println((last - 1) * 10 + 3);
            else if(cnt == 3) System.out.println((last - 1) * 10 + 6);
            else if(cnt == 4) System.out.println((last - 1) * 10 + 10);

        }
        
        scan.close();
    }
}