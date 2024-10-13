import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C492A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int sum = 0;   // Total number of cubes used so far
        int height = 0; // Number of levels in the pyramid

        for (int i = 1; ; i++) {
            int cubesInLevel = i * (i + 1) / 2; // Number of cubes needed for the current level
            if (sum + cubesInLevel > n) {
                break;
            }
            sum += cubesInLevel;
            height++;
        }
        
        System.out.println(height);
        scan.close();
    }
}
