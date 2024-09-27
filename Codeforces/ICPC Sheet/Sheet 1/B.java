import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String s = scan.nextLine();
        String[] p = s.split(" ");

        int i = Integer.parseInt(p[0]);
        long l = Long.parseLong(p[1]);
        char c = p[2].charAt(0);
        float f = Float.parseFloat(p[3]);
        double d = Double.parseDouble(p[4]);

        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.printf("%.2f%n",f);
        System.out.printf("%.1f",d);

        
        scan.close();
    }
}