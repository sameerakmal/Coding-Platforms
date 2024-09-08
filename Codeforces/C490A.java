import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class C490A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int f = n;
        if(n % 3 != 0){
            n -= n % 3;
        }
        // System.out.println(n);
        int n1=0,n2=0,n3 = 0;
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < n/3; i++){
            int cnt = 0;
            for (int j = 0; j < f; j++) {
                if(arr[j] == 1){
                    n1 = j + 1;
                    arr[j] = 0;
                    cnt++;
                    break;
                }
            }
            for (int k = 0; k < f; k++) {
                if(arr[k] == 2){
                    n2 = k + 1;
                    arr[k] = 0;
                    cnt++;
                    break;
                }
            }
            for (int l = 0; l < f; l++) {
                if(arr[l] == 3){
                    n3 = l + 1;
                    arr[l] = 0;
                    cnt++;
                    break;
                }
            }
            if(cnt == 3){
                arrList.add(n1);
                arrList.add(n2);
                arrList.add(n3);
            }
            // System.out.println(Arrays.toString(arr));
        }
        System.out.println(arrList.size()/3);
        for (int i = 0; i < arrList.size(); i += 3) {
            System.out.println(arrList.get(i) + " " + arrList.get(i + 1) + " " + arrList.get(i + 2) + " ");
        }

        
        scan.close();
    }
}