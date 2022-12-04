package ProyectoEncapsulamiento.Proyecto1;

import java.util.ArrayList;

public class Publicaciones {
    // Declaracion de arrauylist para almacenar los objetos de libros y cd
    ArrayList<Libro> publicacionesLibros;
    ArrayList<CD> publicacionesCD;

    // Constructor para inicializar los arraylist
    Publicaciones() {
        publicacionesLibros = new ArrayList<Libro>();
        publicacionesCD = new ArrayList<CD>();
    }

    // Metodo que permite guardar un libro dentro del array
    public void guardarLibro(Libro libro) {
        publicacionesLibros.add(libro);
    }

    //Actualizar el titulo de un libro
    // public void setTituloLibro(String tituloV, String tituloN) {
    // for (Libro lib : publicacionesLibros) {
    // if (lib.getTitulo() == tituloV) {
    // lib.setTitulo(tituloN);
    // return;
    // }
    // }
    // System.out.println("El libro no existe!");
    // }

    // Metodo que permite eliminar un libro con el nombre
    public void eliminarLibro(String nombre) {
        int i = 0;
        for (Libro lib : publicacionesLibros) {
            if (lib.getTitulo() == nombre) {
                publicacionesLibros.remove(i);
                return;
            } else if (i + 1 == publicacionesLibros.size()) {
                System.out.println("El libro no existe!");
            }
            i++;
        }
    }

    // Metodo que permite guardar un cd en el arraylist
    public void guardarCD(CD cd) {
        publicacionesCD.add(cd);
    }

    public void eliminarCD(String nombre) {
        int i = 0;
        for (CD cd : publicacionesCD) {
            if (cd.getTitulo() == nombre) {
                publicacionesLibros.remove(i);
                return;
            } else if (i + 1 == publicacionesCD.size()) {
                System.out.println("El libro no existe!");
            }
            i++;
        }
    }

    // Metodo que permite mostrar los libros publicados
    public void librosPublicados() {
        System.out.println("-----Libros publicados: -----");
        for (Libro lib : publicacionesLibros) {
            System.out.println(lib.toString());
        }
    }

    // Metodo que permite mostrar los cd publicados 
    public void cdPublicados() {
        System.out.println("-----CD'S publicados: -----");
        for (CD cd : publicacionesCD) {
            System.out.println(cd.toString());
        }
    }
}
