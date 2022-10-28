import java.util.Scanner;

public class Persona {
    Scanner in = new Scanner(System.in);
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void dormir() {
        System.out.println("Zzzzzzzzzzzz");
    }

    public void hablar() {
        System.out.println("bla bla bla bla");
    }

    public void contar() {
        System.out.println("1, 2, 3, 4, 5...");
    }

    public void adquirirNombre() {
        System.out.println("Soy una persona. Ingrese mi nombre:");
        this.nombre = in.nextLine();
    }

    public void decirNombre() {
        System.out.println("Mi nombre es: " + this.nombre);
    }
}
