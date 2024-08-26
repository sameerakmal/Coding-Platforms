
import java.util.Scanner;

public class C268A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = n*(n-1);
        int[] arr = new int[num];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int odd = 1;
        int cnt = 0;
        for (int i = 0; i < num; i++) {
            if(i % 2 == 0){
                for(int j = 0; j < n; i++) {
                    if(arr[i] == arr[odd]){
                        cnt++;
                    }
                    else{
                        odd += 2;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
