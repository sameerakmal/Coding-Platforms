import java.util.Scanner;

public class C1335A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int cnt = (n-1)/2;
            System.out.println(cnt);
        }
        
    }
}
