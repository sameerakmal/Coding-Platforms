
import java.util.Arrays;
import java.util.Scanner;

public class C141A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name1 = scan.next();
        String name2 = scan.next();
        String nameGiven = scan.next();
        String nameComb = name1 + name2;

        char[] arrComb = nameComb.toCharArray();
        char[] arrGiven = nameGiven.toCharArray();

        Arrays.sort(arrComb);
        Arrays.sort(arrGiven);

        if(Arrays.equals(arrComb, arrGiven)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
