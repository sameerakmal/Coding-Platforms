import java.util.Scanner;
public class C4A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w  = scan.nextInt();
        if (w % 2 == 0 && w > 2) {
            System.out.println("YES");  
        }
        else{
            System.out.println("NO");
        }
    }    
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CnA {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        // Your logic goes here, using 'scan' to read input
        
        scan.close();
    }
}