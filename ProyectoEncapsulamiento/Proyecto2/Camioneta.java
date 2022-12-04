package ProyectoEncapsulamiento.Proyecto2;

public class Camioneta extends Vehiculo {
    //Declaracion de los atributos de la clase
    private float capacidadCarga;
    private int ejes, rodadas;

    // Super constructor para inicializar los atributos locales y de la clase heredada
    Camioneta(String numSerie, String marca,
            String anio, float precio, float capacidad, int ej, int rod) {
        super(numSerie, marca, anio, precio);
        capacidadCarga = capacidad;
        ejes = ej;
        rodadas = rod;
    }

    // Metodos lectores y modificadores (encapsulamieno)
    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
    }

    // Modificacion del metodo toString de la clase para mostrar el valor de los atributos
    @Override
    public String toString() {
        return super.toString() + "\nCapacidad de carga: " + capacidadCarga + "\nEjes: " + ejes + "\nRodadas: "
                + rodadas;
    }
}
