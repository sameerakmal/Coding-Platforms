import java.util.*;
public class C228A{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> arrset = new HashSet<>();
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++){
            arr[i] = scan.nextInt();
            arrset.add(arr[i]);
        }
        System.out.println(Math.abs(arrset.size()-4));      
    }
}