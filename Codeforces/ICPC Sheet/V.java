import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class V {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int a = scan.nextInt();
        char symb = scan.next().charAt(0);
        int b = scan.nextInt();
        if(symb == '>' && a > b) System.out.println("Right"); 
        else if(symb == '<' && a < b) System.out.println("Right");
        else if(symb == '=' && a == b) System.out.println("Right");
        else System.out.println("Wrong");
        scan.close();
    }
}