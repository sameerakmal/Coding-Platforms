import java.util.Scanner;
public class C546A
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price = scan.nextInt();
		int dollars = scan.nextInt();
		int bananas = scan.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= bananas; i++){
		    sum += price * i;
		}
		
		int f2b = sum - dollars;
		
		if(f2b > 0){
		  System.out.println(f2b);
		}
		else{
		  System.out.println(0);
		}
		
	}
}
