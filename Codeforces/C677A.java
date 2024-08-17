import java.util.Scanner;

public class C677A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        int[] arr = new int[n];
        int width = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > h) {
                width += 2;
            }
            else{
                width += 1;
            }
        }
        System.out.println(width);
    }
}
