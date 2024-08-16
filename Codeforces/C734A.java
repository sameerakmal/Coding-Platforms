import java.util.Scanner;
public class C734A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String sc = scan.next();
            int an = 0;
            int da = 0;
            for (int j = 0; j < sc.length(); j++) {
                if (sc.charAt(j) == 'A') {
                    an++;
                }
                else{
                    da++;
                }
            }
            if (an > da) {
                System.out.println("Anton");
            }
            else if(an < da){
                System.out.println("Danik");
            }
            else{
                System.out.println("Friendship");
            }
        }
        scan.close();
        
    }
}
