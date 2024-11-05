import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1971A {
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
            System.out.print(Math.min(a, b)+ " ");
            System.out.println(Math.max(a,b));
        }
        
        scan.close();
    }
}