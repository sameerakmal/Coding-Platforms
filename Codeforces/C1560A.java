import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class C1560A {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        int[] arr = new int[1000];
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        for (int i = 1; i <= 1700; i++) {
            if(i % 3 == 0 || i % 10 == 3){
            }
            else{
                arrList.add(i);
            }
        }
        
        while(t-- > 0){
            int id = scan.nextInt();
            System.out.println(arrList.get(id));
        }
        
        scan.close();
    }
}