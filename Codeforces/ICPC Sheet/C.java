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
        String input = scan.nextLine();
        String[] inputs = input.split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int x = a + b;
        int y = a * b;
        int z = a - b;

        System.out.println(a + " + " + b +" = " + x);
        System.out.println(a + " * " + b +" = " + y);
        System.out.println(a + " - " + b +" = " + z);


        
        
        scan.close();
    }
}