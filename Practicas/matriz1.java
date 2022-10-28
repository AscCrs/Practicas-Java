//package Practicas;
import java.util.Scanner;

public class matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz [][] = new int [50][50];
        int F = sc.nextInt();
        int C = sc.nextInt();
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                matriz [i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < F; i++) {
                System.out.println(matriz[i][j] + " ");
            }
        }
        sc.close();
    }
}