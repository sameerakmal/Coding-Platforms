import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class C1343B {
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
            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();

            if(n % 4 != 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                for (int j = 1; j < n-1; j++) {
                    if(j % 2 != 0) odd.add(j);
                }
                for (int j = 1; j <= n; j++) {
                    if(j % 2 == 0) even.add(j);
                }
                int sum = 0;
                for (int i = 0; i < odd.size(); i++) {
                    sum += odd.get(i); 
                }
                odd.add(n/2*(n/2+1) - sum);
                for (int i = 0; i < even.size(); i++) {
                    System.out.print(even.get(i) + " ");
                }
                for (int i = 0; i < odd.size(); i++) {
                    System.out.print(odd.get(i) + " ");
                }  
                System.out.println();
            }

        }
        
        scan.close();
    }
}