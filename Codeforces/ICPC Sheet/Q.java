import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        if(x > 0 && y > 0) System.out.println("Q1");
        else if(x > 0 && y < 0) System.out.println("Q4");
        else if(x < 0 && y < 0) System.out.println("Q3");
        else if(x < 0 && y > 0) System.out.println("Q2");
        else if(x == 0 && y == 0) System.out.println("Origem");
        else if(x == 0) System.out.println("Eixo Y");
        else if(y == 0) System.out.println("Eixo X");
        scan.close();
    }
}