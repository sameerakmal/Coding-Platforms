import java.util.Scanner;
 
public class C266A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String s = scan.next();
        
        int count = 0;
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}