import java.util.Scanner;

public class C467A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ra = 0;
        for (int i = 0; i < n; i++) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            if (q-p >= 2) {
                ra++;
            }
        }
        System.out.println(ra);
    }
}
