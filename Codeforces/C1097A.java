import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1097A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String hc = scan.next();
        String[] cards = new String[5];
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            cards[i] = scan.next();
        }
        for (int i = 0; i < 5; i++) {
            if(hc.charAt(0) == cards[i].charAt(0)) {
                found = true;
                break;
            }
            else if(hc.charAt(1) == cards[i].charAt(1)){
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
        
        scan.close();
    }
}