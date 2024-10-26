import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C749A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int h = (int)Math.floor(n/2);
        System.out.println(h);

        if(n % 2 == 0){
            for(int i = 1; i <= h; i++){
                System.out.print(2+ " ");
            }
        }
        else{
            for(int i = 1; i <= h; i++){
                if(i == h) System.out.print(3);
                else System.out.print(2+ " ");
            }
        }
        
        scan.close();
    }
}