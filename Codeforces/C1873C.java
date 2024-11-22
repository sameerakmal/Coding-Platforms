import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1873C {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int t = scan.nextInt();
        scan.nextLine();
        while (t-- > 0) {
            char[][] arr = new char[10][10];
        
            for (int i = 0; i < 10; i++) {
                String s = scan.nextLine();
                arr[i] = s.toCharArray();
            }
        
            int cnt = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(arr[i][j] == 'X'){
                        if(i == 0 || j == 0 || i == 9 || j == 9) cnt += 1;
                        else if(i == 1 || j == 1 || i == 8 || j == 8) cnt += 2;
                        else if(i == 2 || j == 2 || i == 7 || j == 7) cnt += 3;
                        else if(i == 3 || j == 3 || i == 6 || j == 6) cnt += 4;
                        else if(i == 4 || j == 4 || i == 5 || j == 5) cnt += 5;
                    } 
                }  
            }
            System.out.println(cnt);
        }
        scan.close();
    }
}