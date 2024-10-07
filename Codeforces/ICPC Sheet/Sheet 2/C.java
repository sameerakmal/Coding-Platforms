import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int evenCount = 0, oddCount = 0, positiveCount = 0, negativeCount = 0;

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        
        
        scan.close();
    }
}