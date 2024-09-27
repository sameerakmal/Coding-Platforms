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
        long a = Long.parseLong(inputs[0]);
        long b = Long.parseLong(inputs[1]);
        long x = a + b;
        long y = a * b;
        long z = a - b;

        System.out.println(a + " + " + b + " = " + x);
        System.out.println(a + " * " + b + " = " + y);
        System.out.println(a + " - " + b + " = " + z);

        scan.close();
    }
}
