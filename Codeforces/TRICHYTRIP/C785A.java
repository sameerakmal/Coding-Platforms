import java.util.Scanner;

public class C785A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int cnt = 0;
        for (int i = 0; i < t; i++) {
            String geo = scan.next();
            if("Tetrahedron".equals(geo)) cnt += 4;
            else if("Cube".equals(geo)) cnt += 6;
            else if("Octahedron".equals(geo)) cnt += 8;
            else if("Dodecahedron".equals(geo)) cnt += 12;
            else cnt += 20;
        }
        System.out.println(cnt);
    }
}
