import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P2149 {
    public static void main(String[] args) {
        Scanner scan = null;

        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = scan.nextInt();
            int cnt = 0;
            int sqrAr = (int)Math.pow(x, 2);

            if(sqrAr >= a * b){
                System.out.println(0);
                cnt = 1;
            }
            else if(cnt == 0){

                if(sqrAr < a * b){
                    for(int j = a; j > 0; j--){
                        if(sqrAr >= j * b){
                            System.out.println(1);
                            cnt = 1;
                            break;
                        }
                    }
                }

                else if(sqrAr < a * b){
                    for(int j = b; j > 0; j--){
                        if(sqrAr >= j * a){
                            System.out.println(1);
                            cnt = 1;
                            break;
                        }
                    }
                }
            }
            if(cnt == 0){
                System.out.println(2);
            }
        }
        scan.close();
    }
}