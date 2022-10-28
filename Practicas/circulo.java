//package Practicas;

import java.util.Scanner;
public class circulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double r, l, a;
        r = entrada.nextDouble();
        l = (int) 2 * Math.PI * r;
        a = (int)Math.PI * Math.pow(r, 2);
        System.out.println(Math.round(l));
        System.out.print(Math.round(a));
        entrada.close();
    }
}