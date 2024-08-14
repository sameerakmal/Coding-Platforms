import java.util.Scanner;

public class C281A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        
        char ch = Character.toUpperCase(txt.charAt(0));
        txt  = ch + txt.substring(1);
        
        System.out.println(txt);

    }
}
