import java.util.Scanner;
public class C4A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w  = scan.nextInt();
        if (w % 2 == 0 && w > 2) {
            System.out.println("YES");  
        }
        else{
            System.out.println("NO");
        }
    }    
}