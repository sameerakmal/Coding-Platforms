import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1283A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int hr = scan.nextInt();
            int min = scan.nextInt();
            System.out.println(((23 - hr) * 60) + (60 - min));
        }
        
        scan.close();
    }
}