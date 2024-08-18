import java.util.Scanner;

public class C59A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        int cap = 0;
        int low = 0;
        for (int i = 0; i < txt.length(); i++) {
            if(Character.isLowerCase(txt.charAt(i))){
                low++;
            }
            else{
                cap++;
            }
        }
        if(cap > low){
            System.out.println(txt.toUpperCase());
        }
        else{
            System.out.println(txt.toLowerCase());
        }
    }
}
