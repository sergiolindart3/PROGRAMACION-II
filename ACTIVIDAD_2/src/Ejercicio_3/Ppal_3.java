

package Ejercicio_3;

import java.util.Scanner;

/**
 * @author CHECHO
 */
public class Ppal_3 {
    public static void main(String[] args) {
        
    /* El precio de venta de los artículos de una tienda se calcula a partir de su valor de costo fijo, el porcentaje de iva y su porcentaje de
    utilidad. Cree una aplicación en Java, en la que defina e inicialice dichos valores para un artículo, y calcule y muestre su precio de venta */
        double PrVenta, CostFijo, PorcentIVA, PorcentUtilidad, CantIVA, PrIVA;
        char OP = 'S';
        Scanner entrada = new Scanner(System.in);
        while (OP == 'S') {
            System.out.print("Ingrese el costo fijo del articulo: ");
            CostFijo = entrada.nextDouble();
            System.out.print("Ingrese el porcentaje de IVA del articulo: ");
            PorcentIVA = entrada.nextDouble();
            System.out.print("Ingrese el porcentaje de utilidad del articulo: ");
            PorcentUtilidad = entrada.nextDouble();
            PrVenta = ((CostFijo)/(100 - PorcentUtilidad)) * 100;
            CantIVA = (PrVenta * (PorcentIVA)/100);
            PrIVA = (PrVenta * (PorcentIVA)/100) + PrVenta;
            System.out.printf("El precio de venta es: %.2f \n", PrVenta);
            System.out.printf("La cantidad de IVA es: %.2f \n", CantIVA);
            System.out.printf("El precio con IVA es: %.2f \n", PrIVA);
            do {
                System.out.print("Desea continuar ingresando datos S/N : ");
                OP = entrada.next().charAt(0);
                OP = Character.toUpperCase(OP);
            } while((OP != 'S') && (OP != 'N'));   
        }
    }
}
