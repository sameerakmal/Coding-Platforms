import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1950A {
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

            if(a < b && b < c) System.out.println("STAIR");
            else if(a < b && b > c) System.out.println("PEAK");
            else System.out.println("NONE");
        }


        
        scan.close();
    }
}