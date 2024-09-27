import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        String firstLine = scan.nextLine();
        String[] p1 = firstLine.split(" ");
        String secondName1 = p1[1];
        String secondLine = scan.nextLine();
        String[] p2 = secondLine.split(" ");
        String secondName2 = p2[1];
        if (secondName1.equals(secondName2)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
        
        scan.close();
    }
}