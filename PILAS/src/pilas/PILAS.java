package pilas;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Checho
 */
public class PILAS {

    public static boolean esOperador(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    public static int obtenerPrioridad(char operador) {
        if (operador == '+' || operador == '-') {
            return 1;
        } else if (operador == '*' || operador == '/') {
            return 2;
        }
        return 0;
    }

    public static String infijaAPostfija(String expresionInfija) {
        Stack<Character> pila = new Stack<>();
        StringBuilder expresionPostfija = new StringBuilder();

        for (char c : expresionInfija.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                expresionPostfija.append(c);
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.empty() && pila.peek() != '(') {
                    expresionPostfija.append(pila.pop());
                }
                if (!pila.empty() && pila.peek() == '(') {
                    pila.pop();
                }
            } else if (esOperador(c)) {
                while (!pila.empty() && obtenerPrioridad(c) <= obtenerPrioridad(pila.peek())) {
                    expresionPostfija.append(pila.pop());
                }
                pila.push(c);
            }
        }

        while (!pila.empty()) {
            expresionPostfija.append(pila.pop());
        }

        return expresionPostfija.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la expresion infija: ");
        String expresionInfija = scanner.nextLine();

        String expresionPostfija = infijaAPostfija(expresionInfija);
        System.out.println("Expresion postfija: " + expresionPostfija);
    }
}
