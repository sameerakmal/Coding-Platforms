import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class C1703B {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            String s = scan.next();

            ArrayList<Character> arr = new ArrayList<>();
            int cnt = 0;
            for(char c : s.toCharArray()){
                if(arr.contains(c)) cnt++;
                else cnt += 2;
                arr.add(c);
            }
            System.out.println(cnt);
        }
        
        scan.close();
    }
}