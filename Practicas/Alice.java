//package Practicas;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[100];
        int out[] = new int[100];
        int M = 0, mayor = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        mayor = nums[0];
        
        for (int i = 1; i < n; i++) {
            if (mayor < nums[i]) {
                mayor = nums[i];
            } 
        }
        M = 0;
        for (int i = 0; i < n; i++){
            if (mayor != nums[i]){
              out[M]=nums[i];
              M++;
            }
        }
        System.out.println(M);
        if (M != 0) {
            for (int i = 0; i < M-1; i++) {
                System.out.print(out[i]);
                System.out.println();
            }
            System.out.print(out[M-1]);
        }
        sc.close();
    }    
}