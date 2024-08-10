import java.util.Scanner;

public class C231A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int count = 0;
        for(int i = 1; i <= t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if(a == 1 && b == 1 || b == 1 && c == 1 || c == 1 && a == 1  ){
                count++;
            }

        }
        System.out.print(count);
    }
}
