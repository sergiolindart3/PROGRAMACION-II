

package Ejercicio_5;

import java.util.Scanner;

/**
 * @author CHECHO
 */
public class Ppal_5 {
    public static void main(String[] args) {
        
    /* En la Tabla 1 se muestran el número de calorías que contienen las principales frutas. ¿Si Juan cena una ensalada de frutas que contiene 
    2 manzanas, 3 peras, 1 naranja y 1 melón, cuantas calorías ha consumido? Cree una aplicación en java que le permita realizar el cálculo,
    para ello defina e inicialice las variables que considere */
        Scanner entrada = new Scanner(System.in);
        float Manzana = 52;
        float Piña = 55;
        float Pera = 55;
        float Naranja = 45;
        float Fresa = 32;
        float Melon = 54;
        System.out.println("Juan ha consumido : " + ((2 * Manzana) + (3 * Pera) + Naranja + Melon) + "Kcals");
        System.out.println("********** 2DA COMBINACION **********");
        System.out.print("N. de Manzanas consumidas: ");
        float CantManzana = entrada.nextFloat();
        System.out.print("N. de Piñas consumidas: ");
        float CantPiña = entrada.nextFloat();
        System.out.print("N. de Peras consumidas: ");
        float CantPera = entrada.nextFloat();
        System.out.print("N. de Naranjas consumidas: ");
        float CantNaranja = entrada.nextFloat();
        System.out.print("N. de Fresas consumidas: ");
        float CantFresa = entrada.nextFloat();
        System.out.print("N. de Melones consumidos: ");
        float CantMelon = entrada.nextFloat();
        System.out.println("Calorias Consumidas " + ((CantManzana * Manzana) + (CantPiña * Piña ) + (CantPera * Pera) + (CantNaranja * Naranja)
        + (CantFresa + Fresa) + (CantMelon * Melon)) + "Kcals");
    }
}
