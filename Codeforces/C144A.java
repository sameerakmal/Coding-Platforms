import java.util.*;

public class C144A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scan.nextInt();
        }
        int min_val = arr[0];
        int min_idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <= min_val){
                min_val = arr[i];
                min_idx = i;
            }   
        }
        int smaller = t - min_idx - 1;
        for(int i = min_idx; i < t-1; i++){
            arr[i] = arr[i + 1];
        } 
        arr[t-1] = min_val;
        
        int max_val = arr[0];
        int max_idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max_val){
                max_val = arr[i];
                max_idx = i;
            }   
        }
        int ans = smaller + max_idx;
        System.out.print(ans);
    }
}
