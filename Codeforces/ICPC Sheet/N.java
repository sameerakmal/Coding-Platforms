import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int ch = scan.next().charAt(0);
        char con;
        if(ch >= 97) con = (char) (ch - 32);
        else con = (char) (ch + 32);
        System.out.println(con);
        
        scan.close();
    }
}