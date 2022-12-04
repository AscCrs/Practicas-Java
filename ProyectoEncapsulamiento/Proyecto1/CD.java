package ProyectoEncapsulamiento.Proyecto1;

public class CD extends Publicacion {
    // Declaracion del atributo de la clase 
    private float tiempoReproduccion;

    // Super constructor que inicializa el valor de los atributos
    CD(String titulo, float precio, float tiempoReproduccion) {
        super(titulo, precio);
        this.tiempoReproduccion = tiempoReproduccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public float getTiempoReproduccion() {
        return tiempoReproduccion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTiempoReproduccion(float tiempoReproduccion) {
        this.tiempoReproduccion = tiempoReproduccion;
    }

    // Metodo toString que muestra el estado de los atributos
    @Override
    public String toString() {
        return super.toString() + "\nTiempo de reproduccion: " + tiempoReproduccion;
    }
}
