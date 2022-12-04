package ProyectoEncapsulamiento.Proyecto2;
import java.util.ArrayList;

public class Concesionario {    
    // Declaracion de los ArrayList que permitiran guardar los objetos de cada clase
    // para posteriormente mostrarlos como si fuese un inventario
    ArrayList<Auto> autos;
    ArrayList<Vagoneta> vagonetas;
    ArrayList<Camioneta> camionetas;

    // Constructor que inicializa cada un de los arrayList
    public Concesionario() {
        super();
        autos = new ArrayList<Auto>();
        vagonetas = new ArrayList<Vagoneta>();
        camionetas = new ArrayList<Camioneta>();
    }

    // Metodo que agrega un elemento al arraylist de cada tipo
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    public void agregarVagoneta(Vagoneta vagoneta) {
        vagonetas.add(vagoneta);
    }

    public void agregarCamioneta(Camioneta camioneta) {
        camionetas.add(camioneta);
    }

    // Metodo que permite eliminar un elemento del arraylist a traves del atributo:
    // Numero de serie
    public void eliminarAuto(String numSerie) {
        for (int i = 0; i < autos.size(); i++) {
            if (numSerie == autos.get(i).getNumSerieMotor()) {
                autos.remove(i);
                return;
            }
        }
    }
    
    public void eliminarVagoneta(String numSerie) {
        for (int i = 0; i < vagonetas.size(); i++) {
            if (numSerie == vagonetas.get(i).getNumSerieMotor()) {
                vagonetas.remove(i);
                return;
            }
        }
    }
    
    public void eliminarCamioneta(String numSerie) {
        for (int i = 0; i < camionetas.size(); i++) {
            if (numSerie == camionetas.get(i).getNumSerieMotor()) {
                camionetas.remove(i);
                return;
            }
        }
    }

    // Metodos que permiten mostrar todos los automoviles que se encuentren en el almacen
    public void mostrarAutos() {
        System.out.println("    Automoviles:    ");
        for (int i = 0; i < autos.size(); i++) {
            System.out.println(autos.get(i).toString());
        }
    }

    public void mostrarVagonetas() {
        System.out.println("    Vagonetas:    ");
        for (int i = 0; i < vagonetas.size(); i++) {
            System.out.println(vagonetas.get(i).toString());
        }
    }

    public void mostrarCamionetas() {
        System.out.println("    Camionetas:    ");
        for (int i = 0; i < camionetas.size(); i++) {
            System.out.println(camionetas.get(i).toString());            
        }
    }
}
