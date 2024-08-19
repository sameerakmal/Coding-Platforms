import java.util.*;

public class C344A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        List<Integer> remo = new ArrayList<>();

        remo.add(arr[0]);
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                remo.add(arr[i]);
            }
        }
        System.out.println(remo.size());

    }
}
