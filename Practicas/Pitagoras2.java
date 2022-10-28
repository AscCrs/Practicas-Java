//package Practicas;
import java.util.Scanner;
public class Pitagoras2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextInt();
        double B = entrada.nextInt();
        double C = Math.pow(A, 2)+Math.pow(B, 2);
        int c = (int)Math.sqrt(C);
        System.out.print(Math.round(c));
        entrada.close();
    }    
}
