import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class C381A {

    public static void removeFirst(ArrayList<Integer> arr){
        if(!arr.isEmpty()){
            arr.remove(0);
        }
    }

    public static void removeLast(ArrayList<Integer> arr){
        if(!arr.isEmpty()){
            arr.remove(arr.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        int t = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            arr.add(scan.nextInt());
        }
        int s = 0;
        int d = 0;
        int cnt = 1;
        while(!arr.isEmpty()){
            if(arr.get(0) > arr.get(arr.size() -1)){
                if(cnt % 2 != 0){
                    s += arr.get(0);
                }
                else{
                     d += arr.get(0);
                }
                removeFirst(arr);
            }

            else{
                if(cnt % 2 != 0){
                     s += arr.get(arr.size() -1);
                }
                else{
                    d += arr.get(arr.size() -1);
                }
                removeLast(arr);
            }
            cnt++;
        }
    
        System.out.println(s);
        System.out.println(d);
        
        scan.close();
    }
}