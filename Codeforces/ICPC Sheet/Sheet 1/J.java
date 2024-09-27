import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int small = 0;
        int big = 0;
        if(a >= b){
            big = a;
            small = b;
        }
        else{
            big = b;
            small = a;
        }
        if((big % small == 0 && small % big == small) || (big == small)) System.out.println("Multiples");
        else System.out.println("No Multiples");
        
        scan.close();
    }
}