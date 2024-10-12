import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++) System.out.println(i);
        
        scan.close();
    }
}