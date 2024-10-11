import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J {
    

    public static int cntof(int n){
		int cnt = 0;
		for(int i = 1; i <= Math.sqrt(n); i++){
		    if(n % i == 0){
		        if(i == n / i) cnt++;
		        else cnt+= 2;
		    }
		}
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if(cntof(i) == 2) System.out.print(i+ " ");
        }
        


        scan.close();
    }
}