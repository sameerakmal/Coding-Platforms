import java.util.Scanner;

public class C112A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String al = a.toLowerCase();
        String bl = b.toLowerCase();

        
        for(int i = 0; i < a.length(); i++){
            if (al.charAt(i) < bl.charAt(i)) {
                System.out.println(-1);
                return;
            }
            else if (al.charAt(i) > bl.charAt(i)) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
