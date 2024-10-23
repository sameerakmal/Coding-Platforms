import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class GLPR157 {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
		while(t-- > 0){
		    int l1 = scan.nextInt();
		    int l2 = scan.nextInt();
		    
		    String s1 = scan.next();
		    String s2 = scan.next();
		    
		    HashSet h1 = new HashSet<>();
		    HashSet h2 = new HashSet<>();

            for(char c : s1.toCharArray()){
                h1.add(c);
            }
            for(char c : s2.toCharArray()){
                h1.add(c);
            }
            System.out.println(h1);
            if(h1.size() < 26) System.out.println("YES");
            else System.out.println("NO");    
        }
        scan.close();
    }
}