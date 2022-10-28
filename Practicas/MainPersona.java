import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona p = new Persona();

        int respuesta = 0;
        System.out.print("Desea crear una persona? 1.Si, 2.No: ");
        respuesta = in.nextInt();

        if (respuesta == 1) {
            p.adquirirNombre();
            System.out.print("Desea que diga mi nombre? 1.Si, 2.No: ");
            respuesta = in.nextInt();
            if (respuesta == 1) {
                p.decirNombre();
            }

            System.out.print("Desea escucharme hablar? 1.Si, 2.No: ");
            respuesta = in.nextInt();
            if (respuesta == 1) {
                p.hablar();
            }

            System.out.print("Desea que vaya a dormir? 1.Si, 2.No: ");
            respuesta = in.nextInt();
            if (respuesta == 1) {
                p.dormir();
            }

            System.out.print("Desea que oirme contar? 1.Si, 2.No: ");
            respuesta = in.nextInt();
            if (respuesta == 1) {
                p.contar();
            }
        } 
        in.close();
    }
}
