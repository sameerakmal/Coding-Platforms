import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
public class Y {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        String d = scan.next();
        BigInteger abi = new BigInteger(a);
        BigInteger bbi = new BigInteger(b);
        BigInteger cbi = new BigInteger(c);
        BigInteger dbi = new BigInteger(d);
        BigInteger abbi = abi.multiply(bbi);
        BigInteger cbbi = abbi.multiply(cbi);
        BigInteger dbbi = cbbi.multiply(dbi);
        BigInteger ls = dbbi.mod(BigInteger.valueOf(100));
        int dig = ls.intValue();
        if(dig < 10){
            System.out.print(0);
            System.out.print(dig);
        }
        else{
            System.out.print(dig);
        }
        
        scan.close();
    }
}