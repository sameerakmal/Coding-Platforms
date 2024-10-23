import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class C1535A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        while(t-- > 0){
            int[] arr = new int[2];
            int[] brr = new int[2];
            for (int i = 0; i < 2; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < 2; i++) {
                brr[i] = scan.nextInt();
            }
            int[] wrr = new int[4];
            System.arraycopy(arr, 0, wrr, 0, 2);
            System.arraycopy(brr, 0, wrr, 2, 2);
            Arrays.sort(wrr);
            int maxa = Arrays.stream(arr).max().getAsInt();
            int maxb = Arrays.stream(brr).max().getAsInt();
            if((maxa == wrr[3] || maxa == wrr[2]) && (maxb == wrr[3] || maxb == wrr[2])) System.out.println("YES");
            else System.out.println("No");

        }
        
        scan.close();
    }
}