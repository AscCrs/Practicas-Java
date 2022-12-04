package ProyectoEncapsulamiento.Proyecto2;

public class Auto extends Vehiculo {
    // Declaracion de los atributos de la clase 
    private String clasificacion;
    private int cantidadPasajeros;

    // Super constructor 
    Auto(String numSerieMotor, String marca, String anio, float precio,
            String clasificacion, int cantidadPasajeros) {
        super(numSerieMotor, marca, anio, precio);
        this.clasificacion = clasificacion;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // Metodos lectores y modificadores de los atributos de la clase 
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // Modificacion del metodo toString para imprimir el valor de los atributos de la clase
    // Asi como los atributos heredados
    @Override
    public String toString() {
        return super.toString() + "\nClasificacion:" + clasificacion + "\nCantidad de pasajeros: " + cantidadPasajeros;
    }
}
