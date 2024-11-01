import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C492A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int sum = 0;
        int cnt = 0;
        for(int i = 1; ; i++ ){
            sum += i*(i+1)/2;
            if(sum > n) {
                System.out.println(cnt);
                break;
            } 
            cnt++;
        }
        scan.close();
    }
}