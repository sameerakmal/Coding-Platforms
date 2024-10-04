import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class C1520A {
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
            Stack<Character> st = new Stack<>();
            boolean isValid = false;
            for(char c : s.toCharArray()){
                if(st.isEmpty()) st.push(c);
                else if(st.peek() == c) continue;
                else{
                    if(st.contains(c)) isValid = true;
                    else st.push(c);
                }
            }
            if(isValid) System.out.println("NO");
            else System.out.println("YES");
        }
        
        scan.close();
    }
}