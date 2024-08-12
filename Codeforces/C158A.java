import java.util.*;

public class C158A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        
        int count = 0;
        int kth = arr[k-1];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] >= kth) {
                count++;
            }
        }
        System.out.println(count);
        
        
    }
}
