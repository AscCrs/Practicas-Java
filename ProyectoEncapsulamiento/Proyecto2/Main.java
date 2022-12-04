/*
Una agencia vendedora de autos desea un sistema computacional para administrar los
datos de sus vehículos y clasificarlos por tipo. Todos los autos tienen los siguientes 
datos:
    • Número de serie del motor.
    • Marca.
    • Año.
    • Precio.
Los vehículos se clasifican en autos compactos, autos de lujo, camionetas y vagonetas. Para
los autos y vagonetas, también es importante almacenar la cantidad de pasajeros; mientras
que para las camionetas se debe controlar la capacidad de carga en kgs. y la cantidad de
ejes y de rodadas. Agregue un constructor con parámetros a cada clase para inicializar sus 
datos e invoque el constructor de la clase base desde el constructor de cada clase derivada 

Implemente la sobrescritura del método ToString() para mostrar los datos de cada tipo de
auto. 
 */
package ProyectoEncapsulamiento.Proyecto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objetos Scanner que pemritiran ingresar datos
        Scanner escaner = new Scanner(System.in);
        Scanner cadenas = new Scanner(System.in); // Este metodo existe para no sobrecargar el objeto escaner
        Concesionario almacen = new Concesionario(); // Objeto almacen que permitira guardar todos los automoviles
        float precio = 0, capacidadCarga = 0;
        String numSerie = "", marca = "", anio = "", clasificacion = "";
        int opcion = 0, pasajeros = 0, ejes = 0, rodadas = 0;
        boolean validacion = true;

        do {
            System.out.println("Opciones:\n1.Agregar automovil\n2.Agregar vagoneta\n3.Agregar camioneta");
            System.out.println(
                    "4.Eliminar automovil\n5.Eliminar vagoneta\n6.Eliminar camioneta\n7.Mostrar automoviles");
            System.out.print("8.Mostrar vagonetas\n9.Mostrar camionetas\n10.Salir\nEleccion: ");
            opcion = escaner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero de serie del motor: ");
                    numSerie = cadenas.nextLine();
                    System.out.print("Ingrese la marca del vehiculo: ");
                    marca = cadenas.nextLine();
                    System.out.print("Ingrese el año: ");
                    anio = cadenas.nextLine();
                    System.out.print("Ingrese el precio del vehiculo: $");
                    precio = escaner.nextFloat();
                    System.out.print("Ingrese la clasificacion del automovil: ");
                    clasificacion = cadenas.nextLine();
                    System.out.print("Ingrese la cantidad de pasajeros que permite el automovil: ");
                    pasajeros = escaner.nextInt();
                    Auto automovil = new Auto(numSerie, marca, anio, precio, clasificacion, pasajeros);
                    almacen.agregarAuto(automovil);
                    break;
                case 2:
                    System.out.print("Ingrese el numero de serie del motor: ");
                    numSerie = cadenas.nextLine();
                    System.out.print("Ingrese la marca del vehiculo: ");
                    marca = cadenas.nextLine();
                    System.out.print("Ingrese el año: ");
                    anio = cadenas.nextLine();
                    System.out.print("Ingrese el precio del vehiculo: $");
                    precio = escaner.nextFloat();
                    System.out.println("Ingrese la cantidad de pasajeros que permite la vagoneta: ");
                    pasajeros = escaner.nextInt();
                    Vagoneta vagoneta = new Vagoneta(numSerie, marca, anio, precio, pasajeros);
                    almacen.agregarVagoneta(vagoneta);
                    break;
                case 3:
                    System.out.print("Ingrese el numero de serie del motor: ");
                    numSerie = cadenas.nextLine();
                    System.out.print("Ingrese la marca del vehiculo: ");
                    marca = cadenas.nextLine();
                    System.out.print("Ingrese el año: ");
                    anio = cadenas.nextLine();
                    System.out.print("Ingrese el precio del vehiculo: $");
                    precio = escaner.nextFloat();
                    System.out.print("Ingrese la capacidad de carga de la camioneta: ");
                    capacidadCarga = escaner.nextFloat();
                    System.out.print("Ingrese la cantidad de ejes de la camioneta: ");
                    ejes = escaner.nextInt();
                    System.out.print("Ingrese la rodada de la camioneta: ");
                    rodadas = escaner.nextInt();
                    Camioneta camioneta = new Camioneta(numSerie, marca, anio, precio, capacidadCarga, ejes,
                            rodadas);
                    almacen.agregarCamioneta(camioneta);
                    break;
                case 4:
                    System.out.print("Ingrese el numero de serie del motor del auto a eliminar: ");
                    numSerie = cadenas.nextLine();
                    almacen.eliminarAuto(numSerie);
                    break;
                case 5:
                    System.out.print("Ingrese el numero de serie del motor de la vagoneta a eliminar: ");
                    numSerie = cadenas.nextLine();
                    almacen.eliminarVagoneta(numSerie);
                    break;
                case 6:
                    System.out.print("Ingrese el numero de serie del motor de la camioneta a eliminar: ");
                    numSerie = cadenas.nextLine();
                    almacen.eliminarCamioneta(numSerie);
                    break;
                case 7:
                    almacen.mostrarAutos();

                    break;
                case 8:
                    almacen.mostrarVagonetas();

                    break;
                case 9:
                    almacen.mostrarCamionetas();

                    break;
                case 10:
                    validacion = false;

                    break;
                default:
                    System.err.println("Error: elija una opcion valida");
                    break;
            }

        } while (validacion == true);

        cadenas.close();
        escaner.close();
    }
}
