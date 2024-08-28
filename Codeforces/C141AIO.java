
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class C141AIO {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("input.txt"));
            PrintStream output = new PrintStream(new File("output.txt"));

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

            scan.close();
            output.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occured :" + e.getMessage());
        }
    }
}
