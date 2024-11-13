import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1950B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            for (int i = 1; i <= n*2 ; i++) {
                for (int j = 1; j <= n*2; j++) {
                    if(i == j || i + 1 == j || i == j + 1){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                    System.out.println();
                }
                
            }
        }
        
        scan.close();
    }
}