import java.util.*;
public class H {

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
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
		if(cntof(n) == 2) System.out.println("YES");
        else System.out.println("NO");
	}

    

}