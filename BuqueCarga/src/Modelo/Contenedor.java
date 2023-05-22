package Modelo;

/**
 *
 * @author CHECHO
 */
public class Contenedor {

    private double area;
    private double peso;
    private double valor;

    public Contenedor() {
        this.area = 0;
        this.peso = 0;
        this.valor = 0;
    }

    public Contenedor(double area, double peso, double valor) {
        this.area = area;
        this.peso = peso;
        this.valor = valor;
    }

    public double getArea() {
        return area;
    }

    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
