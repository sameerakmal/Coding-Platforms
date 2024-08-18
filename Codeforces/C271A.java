import java.util.*;

public class C271A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yr = scan.nextInt();

        while (true) {
            yr++;
            int currentYear = yr;
            Set<Integer> yrset = new HashSet<>();

            while (currentYear > 0) {
                yrset.add(currentYear % 10);
                currentYear /= 10;
            }
            
            if (yrset.size() == 4) {
                System.out.println(yr);
                break;
            }
        }
    }
}
