

package Modelo;

import java.util.Scanner;

/**
 * @author CHECHO
 */
public class Operation {
    
    //ATRIBUTOS
    double Num1, Num2, Suma, Resta, Producto, Division;
    
    //METODOS
    
    //METODO PEDIR Y LEER 2 NUMEROS
    public void LeerNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite un numero: ");
        Num1 = input.nextDouble();
        System.out.print("Digite otro numero: ");
        Num2 = input.nextDouble();
    }
    
    //METODO SUMA DE NUMEROS
    public void SumNum(){
        Suma = Num1 + Num2;
    }
    
    //METODO RESTA DE NUMEROS
    public void ResNum(){
        Resta = Num1 - Num2;
    }
    
    //METODO MULTIPLICACION DE NUMEROS
    public void ProNum(){
        Producto = Num1 * Num2;
    }
    
    //METODO DIVISION DE NUMEROS
    public void DivNum(){
        Division = Num1 / Num2;
    }
    
    //METODO IMPRIMIR RESULTADOS
    public void ImpDatos(){
        System.out.println("\nRESULTADOS **********");
        System.out.println("La suma de numeros es: " + Suma);
        System.out.println("La Resta de numeros es: " + Resta);
        System.out.println("La Multiplicacion de numeros es: " + Producto);
        System.out.println("La Division de numeros es: " + Division);
    }
}
