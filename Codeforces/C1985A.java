import java.util.*;
public class C1985A{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 1; i <= t; i++){
            String a = scan.next();
        String b = scan.next();

        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        char[] crr = new char[arr.length + brr.length + 1];

        System.arraycopy(arr, 0, crr, 0, arr.length);
        crr[arr.length] = ' ';
        System.arraycopy(brr,0, crr, arr.length + 1, brr.length );

        char temp = crr[0];
        crr[0] = crr[4];
        crr[4] = temp;
        System.out.println(crr);
        }
        

    }
}