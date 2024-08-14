import java.util.*;

public class C1986A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int x1 = scan.nextInt();
            int x2 = scan.nextInt();
            int x3 = scan.nextInt();

            int[] points = {x1, x2, x3};
            Arrays.sort(points);
            int a = points[1];

            int d = Math.abs(a - x1) + Math.abs(a - x2) + Math.abs(a - x3);
            System.out.println(d);
        }
    }
}
