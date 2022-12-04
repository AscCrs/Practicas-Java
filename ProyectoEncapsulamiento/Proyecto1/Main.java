/*
Una compañía editorial produce tanto libros impresos como audio-libros en discos
compactos. Diseñe una clase denominada Publicación que almacene el título (cadena)
y el precio (numérico real) de una publicación. A partir de esta clase, derive dos clases:
Libro a la cual le agregue el número de páginas (entero) y CD, a la cual le agregue el
tiempo de reproducción en minutos (numérico real). Cada una de las clases debe tener
propiedades para acceder a sus respectivos datos. 
 */
package ProyectoEncapsulamiento.Proyecto1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // Procedimiento estatico que genera el menu de opciones
    static void Menu() {
        System.out.println("Menu de opciones:\n1.Agregar Un nuevo libro\n2.Agregar un nuevo CD\n3.Eliminar un libro");
        System.out.println("4.Eliminar un CD\n5.Mostrar libros publicados\n6.Mostrar CD'S publicados\n7.Salir");
        System.out.print("Elija su opcion: ");
    }

    // Procedimiento estatico que limpia la terminal donde se ejecute el codigo 
    static void limpiarConsola() {
        String clean = "\033[H\033[2J";
        sc.nextLine();
        System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR... ");
        sc.nextLine();

        System.out.println(clean);
    }

    public static void main(String[] args) {
        Scanner strings = new Scanner(System.in); // Creacion del objeto escaner que permitira ingresar cadenas de caracteres
        Publicaciones publicacion = new Publicaciones(); // Creacion del objeto publicacion para almacenar nuevas publicaciones
        boolean val = true;
        int opc = 0, numpag;
        float precio, duracion;
        String titulo;

        do {
            Menu();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el titulo del libro: ");
                    titulo = strings.nextLine();
                    System.out.print("Ingrese el precio del libro: $");
                    precio = sc.nextFloat();
                    System.out.print("Ingrese el numero de paginas del libro: ");
                    numpag = sc.nextInt();
                    Libro libro = new Libro(titulo, precio, numpag);
                    publicacion.guardarLibro(libro);

                    limpiarConsola();
                    break;
                case 2:
                    System.out.print("Ingrese el titulo del CD: ");
                    titulo = strings.nextLine();
                    System.out.print("Ingrese el precio del CD: $");
                    precio = sc.nextFloat();
                    System.out.print("Ingrese la duracion del CD: ");
                    duracion = sc.nextFloat();
                    CD cd = new CD(titulo, precio, duracion);
                    publicacion.guardarCD(cd);

                    limpiarConsola();
                    break;
                case 3:
                    System.out.print("Ingrese el titulo del libro a eliminar: ");
                    titulo = strings.nextLine();
                    publicacion.eliminarLibro(titulo);

                    limpiarConsola();
                    break;
                case 4:
                    System.out.print("Ingrese el titulo del CD a eliminar: ");
                    titulo = strings.nextLine();
                    publicacion.eliminarCD(titulo);

                    limpiarConsola();
                    break;
                case 5:
                    publicacion.librosPublicados();

                    limpiarConsola();
                    break;
                case 6:
                    publicacion.cdPublicados();

                    limpiarConsola();
                    break;
                case 7:
                    val = false;
                    break;
                default:
                    System.out.println("Error - Ingrese una opcion valida!");
                    break;
            }
        } while (val == true);

        strings.close();
        sc.close();
    }
}