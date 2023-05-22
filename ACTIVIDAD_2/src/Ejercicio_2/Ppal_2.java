

package Ejercicio_2;

/**
 * @author CHECHO
 */
public class Ppal_2 {
    public static void main(String[] args) {
        
    /* Escriba una aplicación que defina tres variables numéricas, con sus valores iniciales, y muestre la suma, promedio, producto, cociente y
    modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas */
        float Num1 = 3, Num2 = 6, Num3 = 9;
        System.out.printf("La suma de los numeros es: %.2f \n", (Num1 + Num2 + Num3)  );
        System.out.printf("El promedio de los numeros es: %.2f \n", (Num1 + Num2 + Num3) / 3 );
        System.out.printf("El producto de los numeros es: %.2f \n", (Num1 * Num2 * Num3) );
        System.out.printf("El cociente de los numeros es: %.2f \n", (Num1 / Num2 / Num3) );
        System.out.printf("El modulo de los numeros es: %.2f \n", (Num1 % Num2 % Num3) );
    }
}
