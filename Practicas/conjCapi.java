//package Practicas;

import java.util.Scanner;
public class conjCapi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int conj[] = new int [100];
        int N = 0, cond = 0;

        N = sc.nextInt();
        for (int i = 0; i<N; i++) {
            conj[i] = sc.nextInt();
        }
        for (int i = 0; i < N/2; i++) {
            if (conj[i] == conj[N-(i+1)]) {
                cond ++;
            }
        }
        if (cond < (N/2)) {
            System.out.print("NO");
        } else {
            System.out.print("SI");
        }
        sc.close();
    }    
}
