import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C703A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        int mc = 0;
        int cc = 0;
        while(t-- > 0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a > b) mc++;
            else if(a < b) cc++;
        }
        if(mc > cc) System.out.println("Mishka");
        else if(mc < cc) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
        scan.close();
    }
}