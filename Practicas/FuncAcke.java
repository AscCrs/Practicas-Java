//package Practicas;
import java.util.Scanner;
public class FuncAcke {
    static Scanner entrada = new Scanner(System.in);

    static int t(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return t(m - 1,1);
        } else {
            return t(m - 1, t(m, n-1));
        } 
    }
    public static void main (String[] args) {
        int m, n;
        m = entrada.nextInt();
        n = entrada.nextInt();
        System.out.print(t(m, n));
    }
    
}