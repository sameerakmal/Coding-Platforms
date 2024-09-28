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
        
        int a = scan.nextInt();
        int b = scan.nextInt();     
        if(a == 0 && b == 0) System.out.println("NO");
        else if(Math.abs(a-b) == 1 || Math.abs(a-b) == 0) System.out.println("YES");
        else System.out.println("NO");
        scan.close();
    }
}