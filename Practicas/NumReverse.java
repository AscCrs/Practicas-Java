//package Practicas;
import java.util.Scanner;
public class NumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int [1000];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nums[i] =  sc.nextInt();
        }
        for (int i = n - 1; i>=0; i--) {
            System.out.print(nums[i]);
            System.out.println();
        }
        sc.close();
    }
}