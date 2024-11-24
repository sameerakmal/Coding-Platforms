import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scan = null;

        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }

        String s = scan.next();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ',') {
                ans.append(' ');
            } else if (Character.isLowerCase(ch)) {
                ans.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                ans.append(Character.toLowerCase(ch));
            } else {
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());

        scan.close();
    }
}
