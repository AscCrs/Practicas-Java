//package Practicas;

import java.util.Scanner;
public class elef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = 0;
        int N = sc.nextInt();
        int R = sc.nextInt();
        K = R - (N + 1);
        System.out.print(K);
        sc.close();
    }    
}
