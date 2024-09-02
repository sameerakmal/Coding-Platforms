import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1692A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int t = scan.nextInt();
        while(t-- > 0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int cnt = 0;
            if(b > a){
                cnt++;
            }
            if(c > a){
                cnt++;
            }
            if(d > a){
                cnt++;
            }
            System.out.println(cnt);
        }
        

        scan.close();
    }
}