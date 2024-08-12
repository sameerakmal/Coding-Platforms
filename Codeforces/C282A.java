import java.util.Scanner;

public class C282A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int val = 0;
        for(int i = 0; i<t; i++){
            String op = scan.next();
            if(op.charAt(1) == '+'){
                val++;
            }
            else{
                val--;
            }
        }
        System.out.println(val);
    }
}
