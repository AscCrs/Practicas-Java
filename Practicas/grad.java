//package Practicas;
import java.util.Scanner;
public class grad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        int array[] = {1,4,1,5,9,2,6,5,3,5};
        int out [] = {1,4,1,5,9,2,6,5,3,5};
        int lenArray = array.length;
        int outArray = out.length;
        int[] sald = new int[lenArray + outArray];
        if (K > 10) {
            for (int i = 0; i < sald.length; i++) {
                System.arraycopy(array, 0, sald, 0, lenArray);
                System.arraycopy(out, 0, sald, lenArray, outArray);
            }
            System.out.print(sald[K]);   
        } else {
            System.out.print(array[K]);
        }
        sc.close();
    }   
}