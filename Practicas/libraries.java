//package Practicas;
public class libraries {
    public static void main(String[] args) {
        
        //Random
        double numeroR = Math.random();
        System.out.println(numeroR);
        
        //Redondear double y float
        double numero = 4.56;
        long respuesta = Math.round(numero);
        System.out.println(respuesta);
        float numerof = 7.59f;
        int respuesta1 = Math.round(numerof);
        System.out.println(respuesta1);
        
        //Exponente
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);
        
        //Raiz cuadrada
        double raiz = Math.sqrt(9);
        System.out.println(raiz);
        /*Raiz cuadrada en enteros
        int raiz = (int)Math.sqrt(9);
        System.out.println(raiz);
        */
    }
}
