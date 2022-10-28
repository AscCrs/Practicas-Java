//package Practicas;
import java.util.Scanner;
public class FormGen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b , c, x1, x2, d = 0;
		a=entrada.nextDouble();
		b=entrada.nextDouble();
		c=entrada.nextDouble();
		d = Math.pow(b, 2) - ((4*a)*c);
		x1= (-b + (Math.sqrt(d))) / (2*a);
		x2= (-b - (Math.sqrt(d))) / (2*a);
        System.out.println("X1: " + x1);
		System.out.print("X2: " + x2);
		entrada.close();
	}
}