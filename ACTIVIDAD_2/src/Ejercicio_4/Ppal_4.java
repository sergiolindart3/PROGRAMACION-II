

package Ejercicio_4;

import java.util.Scanner;

/**
 * @author CHECHO
 */
public class Ppal_4 {
    public static void main(String[] args) {
    
    /* Se desea construir un programa en java que permita calcular el costo total de un viaje que tiene una duración en días. Para ello, se
    requiere los siguientes datos: Número de días del viaje, Total de kilómetros conducidos por día, costo por litro de gasolina, promedio de
    kilometro por litro de gasolina, pago por estacionamiento por día, pago de peajes por día. Imprima en consola el resultado */
        double TotalKm, CostLitro, PromKM, PagoEstacion, PagoPeaje, TotalLitro, TotalEstacion,
        valorTotalPeaje;
        int NumDias;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el No de dias del viaje: ");
        NumDias = input.nextInt();
        System.out.print("Ingrese el total de KM conducidos por dia: ");
        TotalKm = input.nextDouble();
        System.out.print("Ingrese el costo por litro de gasolina: ");
        CostLitro = input.nextDouble();
        System.out.print("Ingrese promedio de KM por litro de gasolina: ");
        PromKM = input.nextDouble();
        System.out.print("Ingrese el pago por estacionamiento por dia: ");
        PagoEstacion = input.nextDouble();
        System.out.print("Ingrese pago de peajes por dia: ");
        PagoPeaje = input.nextDouble();
        valorTotalPeaje = PagoPeaje * NumDias;
        TotalLitro = ((TotalKm * NumDias) / PromKM) * CostLitro;
        TotalEstacion = PagoEstacion * NumDias;
        System.out.printf("El valor total del viaje fue de: %.2f \n", TotalLitro + TotalEstacion + valorTotalPeaje);
   }
}
