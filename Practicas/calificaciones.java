//package Practicas;

import java.util.Scanner;
public class calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float calif = sc.nextFloat();
        if (calif < 6 && calif > 0) {
            System.out.print("Reprobatoria");
        } else if (calif > 6) {
            System.out.print("Aprobatoria");
        } else { System.out.print("No existe"); }
        sc.close();
    }
}