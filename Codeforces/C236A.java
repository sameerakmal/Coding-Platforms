import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class C236A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String user = scan.next();

            Set<Character> unqSet = new HashSet<>();

            for (int i = 0; i < user.length(); i++) {
                unqSet.add(user.charAt(i));
            }
            if (unqSet.size() % 2 == 0) {
                System.out.println("CHAT WITH HER!");
            }
            else{
                System.out.println("IGNORE HIM!");
            }
    }
}
