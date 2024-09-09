import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C9A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        int gre = 0;
        if(a > b) gre = a ;
        else gre = b;
        int cha = 6 - gre + 1;
        if(cha == 0) System.out.println("0/1");
        else if(cha == 1) System.out.println("1/1");
        else if(cha == 3) System.out.println("1/2");
        else if(cha == 4) System.out.println("2/3");
        else if(cha == 5) System.out.println("5/6");
        else if(cha == 2) System.out.println("1/3");
        scan.close();
    }
}