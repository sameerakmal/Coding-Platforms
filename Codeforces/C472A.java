import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C472A {
    public static boolean checkPrime(int n){
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) { 
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int a = scan.nextInt();
        int h1 = a/2;
        int h2 = a-h1;
        boolean comp = false;
        while(!comp){
            if(!checkPrime(h1) && !checkPrime(h2)){
                System.out.println(h1 + " " + h2);
                comp = true;
            }
            else{
                h1++;
                h2--;
            }
        }
        
        scan.close();
    }
}
