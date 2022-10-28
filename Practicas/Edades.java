//package Practicas;

import java.util.Scanner;
public class Edades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int L;
        L = entrada.nextInt();
        if (L >= 0 && L <= 3) {
            System.out.print("BEBE");
        } else if (L >= 4 && L <= 14) {
            System.out.print("NINO");
        } else if (L >=15 && L <= 18) {
            System.out.print("JOVEN");
        } else if (L >= 19 && L <= 65) {
            System.out.print("ADULTO");        
        } else if (L > 65 && L <= 99 ) {
            System.out.print("ADULTO 3RA");
        }
        entrada.close();
    }
}
