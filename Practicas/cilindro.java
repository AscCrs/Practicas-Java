//package Practicas;

import java.util.Scanner;
public class cilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, v;
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        a = 2 * Math.PI * ((r * h) + Math.pow(r, 2));
        v = Math.PI * Math.pow(r, 2) * h;
        System.out.println("AREA=" + a);
        System.out.print("VOLUMEN=" + v);
        sc.close();
    }
}