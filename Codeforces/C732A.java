import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C732A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int pri = scan.nextInt();
        int coi = scan.nextInt();
        int cnt = 0;
        for (int i = 1; i < 100; i++) {
            int priceT = pri * i;
            int last = priceT % 10;
            if(last == 0 || last == coi){
                System.out.println(i);
                break;
            }
      
        }
        
        scan.close();
    }
}