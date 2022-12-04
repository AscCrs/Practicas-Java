package ProyectoEncapsulamiento.Proyecto2;

public class Vagoneta extends Vehiculo {
    // Declaracion de los atributos de la clase
    private int cantidadPasajeros;

    // Super constructor para inicializar los atributos locales y de la clase heredada
    Vagoneta(String numSerieMotor, String marca, String anio, float precio,
            int cantidadPasajeros) {
        super(numSerieMotor, marca, anio, precio);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // Metodo lector y modificador del atributo de la clase
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // Modificacion del metodo toString para imprimir el valor de los atributos del objeto
    @Override
    public String toString() {
        return super.toString() + "\nCantidad de pasajeros: " + cantidadPasajeros;
    }
}
