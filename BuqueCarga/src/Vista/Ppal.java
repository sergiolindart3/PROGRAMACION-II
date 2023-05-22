package Vista;

import Modelo.Buque;
import Modelo.Contenedor;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author CHECHO
 */
public class Ppal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double areaPlataforma, limitePeso;
        int dia, mes, año;

        System.out.println("********** DATOS DEL BARCO **********");
        System.out.print("AREA DE PLATAFORMA: ");
        areaPlataforma = input.nextDouble();
        System.out.print("LIMITE DE PESO: ");
        limitePeso = input.nextDouble();

        System.out.println("\n********** DATOS FECHA DE ARRIBO **********");
        System.out.print("AÑO: ");
        año = input.nextInt();
        System.out.print("MES: ");
        mes = input.nextInt();
        System.out.print("DIA: ");
        dia = input.nextInt();
        LocalDate fechaArribo = LocalDate.of(año, mes, dia);

        System.out.println("\n********** DATOS FECHA DE ZARPADO **********");
        System.out.print("AÑO: ");
        año = input.nextInt();
        System.out.print("MES: ");
        mes = input.nextInt();
        System.out.print("DIA: ");
        dia = input.nextInt();
        LocalDate fechaZarpado = LocalDate.of(año, mes, dia);

        Buque buque1 = new Buque(areaPlataforma, limitePeso, fechaArribo, fechaZarpado);

        System.out.println("\n********** PRIMER CONTENEDOR **********");
        double area, peso, valor;

        System.out.print("AREA DEL CONTENEDOR: ");
        area = input.nextDouble();
        System.out.print("PESO DEL CONTENEDOR: ");
        peso = input.nextDouble();
        System.out.print("VALOR DEL CONTENEDOR: ");
        valor = input.nextDouble();

        Contenedor contenedor1 = new Contenedor(area, peso, valor);
        System.out.println(buque1.cargarContenedor(contenedor1));
        mostrar(contenedor1, buque1);

        System.out.println("\n********** SEGUNDO CONTENEDOR **********");
        System.out.print("AREA DEL CONTENEDOR: ");
        area = input.nextDouble();
        System.out.print("PESO DEL CONTENEDOR: ");
        peso = input.nextDouble();
        System.out.print("VALOR DEL CONTENEDOR: ");
        valor = input.nextDouble();

        Contenedor contenedor2 = new Contenedor(area, peso, valor);
        System.out.println(buque1.cargarContenedor(contenedor2));
        mostrar(contenedor2, buque1);
    }

    public static void mostrar(Contenedor contenedor, Buque buque1) {
        System.out.println("AREA DE PLATAFORMA DISPONIBLE: " + buque1.areaDisponible());
        System.out.println("PESO DE PLATAFORMA DISPONIBLE: " + buque1.pesoPermitido());
        System.out.println("FECHA ARRIBO: " + buque1.getFechaArribo());
        System.out.println("FECHA ZARPADO: " + buque1.getFechaZarpado());
        System.out.println("VALOR CARGA: " + buque1.valorCarga());
        System.out.println("NUMERO DE CONTENEDORES: " + buque1.contenedoresCargados());
    }
}
