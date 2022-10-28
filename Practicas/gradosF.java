//package Practicas;
import java.util.Scanner;
public class gradosF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        gradosC = sc.nextDouble();
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC +" ºC = " + gradosF + " ºF");                                                 
        sc.close();
    }
}