
import java.util.Scanner;

class C996A{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int bl = n;
        int cnt = 0;
        while(bl > 0){
            cnt++;
            if(bl >= 100){
                bl -= 100;
                
            }
            else if(bl >= 20){
                bl -= 20;
                
            }
            else if(bl >= 10){
                bl -= 10;
                
            }
            else if(bl >= 5){
                bl -= 5;
                
            }
            else{
                bl -= 1;
                
            }
        }
        System.out.println(cnt);
    }
}