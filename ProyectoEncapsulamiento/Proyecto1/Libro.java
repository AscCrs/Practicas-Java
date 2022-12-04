package ProyectoEncapsulamiento.Proyecto1;

public class Libro extends Publicacion {
    // Declaracion del atributo numero de paginas
    private int numeroPaginas;

    // Super constructor que permite inicializar el valor del atributo de la clase
    // Y de los atributos que hereda de la clase padre
    public Libro(String titulo, float precio, int numeroPaginas) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
    }

    // Encapsulamiento de los metodos
    public String getTitulo() {
        return titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Metodo toStirng que muestra el valor de los atributos
    @Override
    public String toString() {
        return super.toString() + "\nNúmero de páginas: " + numeroPaginas;
    }
}
