

package Ejercicio_1;

import java.util.Scanner;

/**
 * @author CHECHO
 */
public class Ppal_1 {
    public static void main(String[] args) {
        
    /* Un vendedor minorista en línea requiere un informe de las ventas del día. Para ello cuenta con tres arreglos de n elementos cada uno:
    A, B y C. El primero almacena el código de los productos vendidos en el día, El segundo almacena el valor de venta de cada producto, y el
    tercero la cantidad de unidades vendidas de cada producto */
        int CantProducto;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad de Productos: ");
        CantProducto = entrada.nextInt();
        int[] A = new int[CantProducto];
        double[] B = new double[CantProducto];
        int[] C = new int[CantProducto];
        for (int i = 0; i < CantProducto; i++) {
            System.out.print("Codigo del Producto: ");
            A[i] = entrada.nextInt();
            System.out.print("Valor de Venta del Producto: ");
            B[i] = entrada.nextDouble();
            System.out.print("Cantidad de Unidades Vendidas del Producto: ");
            C[i] = entrada.nextInt();
        }
        int TotalProdVendidos = 0;
        for (int i = 0; i < CantProducto; i++) {
            TotalProdVendidos = TotalProdVendidos + C[i];
        }
        double TotalIngresos = 0;
        for (int i = 0; i < CantProducto; i++) {
            TotalIngresos = TotalIngresos + (B[i] * C[i]);
        }
        int wwe = C[1], SA = 1;
        for (int a = 0; a < CantProducto; a++) {
            if (C[a] > wwe) {
                wwe = C[a];
                SA = a;
            }
        }
        int qw = (int) B[1], SF = 1;
        for (int i = 0; i < CantProducto; i++) {
            if (B[i] > qw) {
                qw = (int) B[i];
                SF = i;
            }
        }
        System.out.println("Total de Productos Vendidos en el Dia: " + TotalProdVendidos);                
        System.out.println("Total de Ingresos por Venta en el Dia: " + TotalIngresos);                
        System.out.println("Producto mas Vendido: " + A[SA]);                
        System.out.println("Producto mas Costoso: " + A[SF]);
    }
}