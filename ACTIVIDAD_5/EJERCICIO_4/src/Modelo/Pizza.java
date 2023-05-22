/* Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber el tamaño - mediana
o familiar - el tipo - margarita, cuatro quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se han servido. Siempre que se crea una pizza
nueva, su estado es “pedida” */

package Modelo;

/**
 * @author CHECHO
 */
public class Pizza {
   
    //ATRIBUTOS DE INSTANCIA
    private String tamaño;
    private String tipo;
    private String estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    //METODO CONSTRUCTOR   
    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        totalPedidas++;
    }
    
    //METODOS GETTER
    public String getTamaño() {
        return tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }
    
    //METODOS
    public void sirve() {
        if (estado.equals("pedida")) {
            estado = "servida";
            totalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }
    
    @Override
    public String toString(){
        return "pizza " + tipo + " " + tamaño + ", " + estado;
    }
}
