import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C581A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int r = scan.nextInt();
        int b = scan.nextInt();
        int combo = 0;
        int same = 0;
        for (int i = r , j = b; i > 0 || j > 0 ;) {
            if(i > 0 && j > 0){
                i--;
                j--;
                combo++;
            }
            else if(i > 0){
                same = i/2;
                i = 0;
            }

            else if(j > 0){
                same = j/2;
                j = 0;
            }
        }
        System.out.println(combo + " " + same);
        
        scan.close();
    }
}