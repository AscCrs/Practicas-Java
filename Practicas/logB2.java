//package Practicas;
import java.util.Scanner;
public class logB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double N = sc.nextDouble();
        N = Math.log(N) / Math.log(2);
        System.out.print(Math.round(N));
        sc.close();
    }       
}