package NotacionPolaca;
import java.util.Stack;
public class conversion {
    static StringBuilder conversionPrefijo(String expresion) {
        StringBuilder eprefija = new StringBuilder();
        StringBuilder einfija = new StringBuilder(expresion); 
        einfija.reverse();
        Stack<Character> stack = new Stack<Character>();
        char[] carexp = new String(einfija).toCharArray();

        for (int i = 0; i < carexp.length; i++) {
            if (carexp[i] == '(' ) {
                carexp[i] = ')';
                i++;
            }
            else if (carexp[i] == ')') {
                carexp[i] = '(';
                i++;
            }
        }

        for (int i = 0; i < carexp.length; i++) {
            char car = carexp[i];
            
            // ! Operador
            if (jerarquia(car) > 0 && jerarquia(car) < 4) {
                while (stack.isEmpty() == false && jerarquia(stack.peek()) >= jerarquia(car)) {
                    eprefija.append(stack.pop());
                }
                stack.push(car);
            }
            // ! En caso de que sea un parentesis de cierre 
            else if (car == ')') {
                char aux = stack.pop();
                while (aux != '(') {
                    eprefija.append(aux);
                    aux = stack.pop();
                }
            }
            // ! En caso de que sea un parentesis de apertura
            else if (car == '(') {
                stack.push(car);
            } 
            // ! En caso de que sea un numero
            else {
                eprefija.append(car);
            }
        } // * Termina el segundo FOR
        
        // ! Vaciar el stack
        for (int i = 0; i <= stack.size(); i++) {
            eprefija.append(stack.pop());
        } // * Termina el tercer FOR

        return eprefija.reverse();
    }

    static int jerarquia(char car) {
        switch (car) {
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
            case '(':
            case ')':
                return 4;             
        }// * Termina el SWITCH
        return -1;
    }

    
    public static void main(String[] args) {
        String expresion = "15/7-1+1*3";
        String prefija = conversion.conversionPrefijo(expresion).toString();
        System.out.println("Conversion prefija: " + prefija);
    }   

}
