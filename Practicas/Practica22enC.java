/**
    La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
    clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es 
    de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega 
    en un embarque, considerando lo siguiente: si es de tipo A, se le cargan 20¢  al precio inicial cuando 
    es de tamaño 1; y 30¢ si es de tamaño 2. Si es de tipo B, se rebajan 30¢ cuando es de tamaño 1, y 50¢ 
    cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
 */
import java.util.Scanner;

public class Practica22enC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float precio = 0, precioNuevo = 0, kilo = 0, total = 0, ganancia = 0;
        int tamano;
        char tipo;
        
        do {
            System.out.print("Ingrese el tipo de uva: ");
            tipo = in.next().charAt(0);
            if (!(tipo == 'A' || tipo == 'B')) {
                System.out.println("Ingrese una opcion valida!");                
            } else {
                break;
            }
        } while (true);

        do {
            System.out.print("Ingrese el tamaño de la uva: ");
            tamano = in.nextInt();
            if (!(tamano == 1 || tamano == 2)) {
                System.out.println("Ingrese una opcion valida!");
            } else {
                break;
            }
        } while (true);

        do {
            System.out.print("Ingrese el precio inicial de la uva en kg: ");
            precio = in.nextFloat();
            if (precio <= 0) {
                System.out.println("Ingrese un precio valido!");
            } else {
                break;
            }
        } while (true);

        
        do {
            System.out.print("Ingrese la cantidad de Uva: ");
            kilo = in.nextFloat();
            if (kilo <= 0) {
                System.out.println("Ingrese una cantidad de uva valida!");
            } else {
                break;
            }
        } while (true);

        if (tipo == 'A') {
            if (tamano == 1) {
                precioNuevo = precio + 0.20f;
                total = precioNuevo * kilo;
                ganancia = total - precio * kilo;
            } else {
                precioNuevo = precio + 0.30f;
                total = precioNuevo * kilo;
                ganancia = total - precio * kilo;
            }
        } else {
            if (tamano == 1) {
                precioNuevo = precio - 0.30f;
                total = precioNuevo * kilo;
                ganancia = total - precio * kilo;
            } else {
                precioNuevo = precio - 0.50f;
                total = precioNuevo * kilo;
                ganancia = total - precio * kilo;
            }
        }

        try {
            System.out.println("\033[H\033[2J");
            System.out.println("Cargando resultados!");
            Thread.sleep(2000);
            System.out.println("\033[H\033[2J");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("El total por " + kilo + "kg de uva es de $" + total + "\nCon una ganacia de $" + ganancia);

        in.close();
    }
}