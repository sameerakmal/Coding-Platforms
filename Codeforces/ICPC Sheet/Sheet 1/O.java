import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        String exp = scan.next();
        if(exp.contains("+")){
            String[] nums = exp.split("\\+");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            System.out.println(a+b);
        }
        else if(exp.contains("-")){
            String[] nums = exp.split("-");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            System.out.println(a-b);
        }
        else if(exp.contains("*")){
            String[] nums = exp.split("\\*");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            System.out.println(a*b);
        }
        else if(exp.contains("/")){
            String[] nums = exp.split("/");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            System.out.println(a/b);
        }
        scan.close();
    }
}