
import java.util.Scanner;

public class C510A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if(i % 2 != 0){
                    System.out.print("#");
                }
                else if(i % 2 == 0 && i + j == c + 2){
                    System.out.print("#");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }        
    }
}
