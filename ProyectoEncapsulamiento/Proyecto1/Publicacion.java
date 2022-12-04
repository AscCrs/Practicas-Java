package ProyectoEncapsulamiento.Proyecto1;

public class Publicacion {
    // Declaracion de los atributos de la clase padre
    String titulo;
    float precio;

    // Constructor que inicializa los valores de los atibutos de la clase padre
    public Publicacion(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    // Metodo toString que permite mostrar los valores de los atributos de la clase padre
    @Override
    public String toString() {
        return "Título: " + titulo + "\nprecio: $" + precio;
    }
}
