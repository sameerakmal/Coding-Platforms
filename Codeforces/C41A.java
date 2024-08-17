import java.util.*;

public class C41A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        String rt = new StringBuilder(t).reverse().toString();
        if (rt.equals(s)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
