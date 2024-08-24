import java.util.*;
public class C443A {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s = scan.nextLine();
       HashSet strSet = new HashSet();
       int pre = 1;
       for(int i = 1; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
              strSet.add(s.charAt(i));
            }
       }
       System.out.println(strSet.size());
    }
}
