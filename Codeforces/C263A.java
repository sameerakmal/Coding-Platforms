import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C263A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int idx = 0;
        int jdx = 0;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                int n = scan.nextInt();
                if(n == 1){
                    idx = i;
                    jdx = j;
                }
            }
       }
       System.out.println(Math.abs(idx-3) + Math.abs(jdx-3));

        scan.close();
    }
}