import java.util.*;
public class C486A{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long fn = 0;
        if(n % 2 == 0){
            fn = n/2;
        }
        else{
            fn = -(n + 1)/2;
        }
        System.out.print(fn);
    }
}