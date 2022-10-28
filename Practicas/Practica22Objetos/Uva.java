package Practica22Objetos;

public class Uva {
    private char tipo;
    private int tamano;
    private float precio;
    private float cantidad;

    public Uva(char tipo, int tamano, float precio, float cantidad) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public char getTipo() { return tipo; }

    public int getTamano() { return tamano; }

    public float getPrecio() { return precio; }

    public float getCantidad() { return cantidad; }

    public String calcularGanancia() {
        float ganancia = 0, precioNuevo = 0, total = 0;
        
        if (this.tipo == 'A') {
            if (this.tamano == 1) {
                precioNuevo = this.precio + 0.20f;
                total = precioNuevo * this.cantidad;
                ganancia = total - this.precio * this.cantidad;
            } else {
                precioNuevo = this.precio + 0.30f;
                total = precioNuevo * this.cantidad;
                ganancia = total - this.precio * this.cantidad;
            }
        } else {
            if (this.tamano == 1) {
                precioNuevo = this.precio - 0.30f;
                total = precioNuevo * this.cantidad;
                ganancia = total - this.precio * this.cantidad;
            } else {
                precioNuevo = this.precio - 0.50f;
                total = precioNuevo * this.cantidad;
                ganancia = total - this.precio * this.cantidad;
            }
        }

        return "El total por " + cantidad + "kg de uva es de $" + total + "\nCon una ganacia de $" + ganancia;
    }
}
