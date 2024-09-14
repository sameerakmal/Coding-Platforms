import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C431A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        String s = scan.next();
        int cal = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1') cal += a;
            else if(ch == '2') cal += b;
            else if(ch == '3') cal += c;
            else cal += d;
        }
        System.out.println(cal);
        scan.close();
    }
}