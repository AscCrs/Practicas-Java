package Practica22Objetos;
import java.util.Scanner;

public class MainUva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float precio, cantidad;
        int tamano;
        char tipo;

        

        do {
            System.out.println("Ingrese El tipo de la Uva: ");
            tipo = in.next().charAt(0);
            switch (tipo) {
                case 'A':
                    
                    break;
                case 'B':

                    break;
                default:
                    System.out.println("Ingrese una opción valida!");
                    break;
            }
            
            if (!(tipo == 'A' || tipo == 'B')) {
                System.out.println("Ingrese un valor valido!");
            } else break;
        } while (true);

        do {
            System.out.println("Ingrese el tamaño de la uva: ");
            tamano = in.nextInt();
            if (!(tamano == 1 || tamano == 2)) {
                System.out.println("Ingrese un valor valido!");
            } else break;
        } while (true);

        

        in.close();
    }    
}
