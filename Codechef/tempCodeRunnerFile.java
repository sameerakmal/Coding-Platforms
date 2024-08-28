import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P2149 {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = scan.nextInt();
            int cnt = 0;
            double sqrAr = Math.pow(x, 2); 
            if(sqrAr >= a * b){