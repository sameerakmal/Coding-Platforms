import java.util.Arrays;
import java.util.Scanner;

public class C339A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        String[] num = s.split("\\+");
        Arrays.sort(num);
        String result = String.join("+", num);

        System.out.println(result);
    }
}
