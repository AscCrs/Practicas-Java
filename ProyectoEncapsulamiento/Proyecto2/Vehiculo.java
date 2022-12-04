package ProyectoEncapsulamiento.Proyecto2;

public class Vehiculo {
    // Declaracion de los atributos que la clase heredara a las demas
    // El modificador de acceso protected indica que el valor del atributo puede ser accedido desde
    // Cualquier clase que herede de esta
    protected String numSerieMotor, marca, anio; 
    protected float precio;

    // Constructor que inicializa el valor de los atributos
    Vehiculo(String numSerieMotor, String marca, String anio, float precio) {
        super();
        this.numSerieMotor = numSerieMotor;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    // Metodos lectores y modificadores que podran ser accedidos desde 
    // Cualquier clase que herede de esta
    public String getNumSerieMotor() {
        return numSerieMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setNumSerieMotor(String numSerieMotor) {
        this.numSerieMotor = numSerieMotor;
    }

    public String getAnio() {
        return anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    // Modificacion del metodo toString que mostrara el valor de todos los atibutos de la clase
    // Hasta para las clases que hereden de esta
    @Override
    public String toString() {
        return "Numero de serie (motor): " + numSerieMotor + "\nMarca: " + marca +
                "\nAño: " + anio + "\nPrecio: $" + precio;
    }
}
