import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class K {

    public static void pD(int n) {
        ArrayList<Integer> div = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                div.add(i); 
                if(i != n / i) {
                    div.add(n / i);
                }
            }
        }
        Collections.sort(div); 
        for(int di : div) {
            System.out.println(di); 
        }
    }

    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        pD(n);
        
        scan.close();
    }
}
