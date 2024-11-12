import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C1950C {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
       int t = scan.nextInt();
       while (t-- > 0) {
           String s = scan.next();
           String[] time = s.split(":");

           int hr = Integer.parseInt(time[0]);
           String fr = "AM";
           if(hr > 12){
                hr = hr - 12;
                fr = "PM";
           }
           else if(hr == 12){
            hr = 12;
            fr = "PM";
            }
           else if(hr == 0) hr = 12;
           if(hr >= 10) System.out.println(hr + ":"+ time[1] +" "+ fr );
           else System.out.println("0"+ hr + ":"+ time[1] +" "+ fr );
           




       }
        
        scan.close();
    }
}