import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1926A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            String s = scan.next();
            
            int ant = 0;
            int bnt = 0;
            for(char c : s.toCharArray()){
                if(c == 'A') ant++;
                else bnt++;
            }
            if(ant > bnt) System.out.println("A");
            else System.out.println("B");
        }
        
        scan.close();
    }
}