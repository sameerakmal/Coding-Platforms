import java.util.Scanner;

public class C705A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        StringBuilder hl = new StringBuilder();
        for(int i = 1; i <= a; i++){
            if(i % 2 == 0 && i == a){
                hl.append("I love it");
            }
            else if(i == a){
                hl.append("I hate it");
            }
            else if(i % 2 == 0){
                hl.append("I love that ");
            }
            else{
                hl.append("I hate that ");
            }
        }
        System.out.println(hl.toString());
    }
}
