import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwoClose157 {

    public static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            sum += arr[i];
        }
        return sum;
    }
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
            int[] arr = new int[n+1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            int sum = sumArr(arr);
            for (int i = 0; i < arr.length; i++) {
                int l = 2*arr[n];
                for (int j = 0; j < n; j++) {  
                    if(arr[j] <= 2 * arr[n]) {  
                        int temp = arr[j];
                        arr[j] = arr[n];
                        arr[n] = temp;
                
                        int newSum = sumArr(arr);  
                        if(newSum < sum) {
                            sum = newSum;  
                        } else {
                            arr[n] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                
            }
            System.out.println(sum);
        }
        
        scan.close();
    }
}