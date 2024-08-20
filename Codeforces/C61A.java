
import java.util.Scanner;

public class C61A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.next();
        String num2 = scan.next();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < num1.length(); i++){
            if(num1.charAt(i) == num2.charAt(i)){
                ans.append(0);
            }
            else{
                ans.append(1);
            }
        }
        System.out.println(ans.toString());

    }
}
