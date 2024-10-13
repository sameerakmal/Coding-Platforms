import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        String reversed = new StringBuilder(n).reverse().toString();
        System.out.println(Integer.parseInt(reversed));
        if (n.equals(reversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}
