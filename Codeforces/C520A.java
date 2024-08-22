import java.util.HashSet;
import java.util.Scanner;

public class C520A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String s = scan.next();
        String sl = s.toLowerCase();
        HashSet<Character> strSet = new HashSet<>();
        for(int i = 0; i < sl.length(); i++){
            strSet.add(sl.charAt(i));
        }
        if(strSet.size() == 26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
