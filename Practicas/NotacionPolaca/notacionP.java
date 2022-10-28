package NotacionPolaca;
public class notacionP {
    public static void main(String[] args) {
        String expresion = "15/7-1+1*3";
        String prefija = conversion.conversionPrefijo(expresion).toString();
        System.out.println("Conversion prefija: " + prefija);
    }   
}