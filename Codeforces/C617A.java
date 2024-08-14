import java.util.Scanner;
 
public class C617A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        
        int steps = x / 5;
        if (x % 5 != 0) {
            steps += 1;
        }
        
        System.out.println(steps);
    }
}