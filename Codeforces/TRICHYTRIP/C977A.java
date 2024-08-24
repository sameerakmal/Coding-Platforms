import java.util.Scanner;

public class C977A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            if(n % 10 == 0){
                n = n/10;
            }
            else{
                n -= 1;
            }
        }
        System.out.println(n);
    }
}
