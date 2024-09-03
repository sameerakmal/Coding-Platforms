import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Con2009B {
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
            int fI = n;
            int[] arr = new int[n];
            int idx = 0;
            for (int j = 0; j < n; j++) {
                String s = scan.next();
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == '#'){
                        idx = i + 1;
                    }  
                }
                arr[j] = idx;
            }
            // System.out.println(Arrays.toString(arr));
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
            

        }        
        scan.close();
    }
}