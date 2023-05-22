package Modelo;

import java.time.LocalDate;

/**
 *
 * @author CHECHO
 */
public class Buque {

    private double areaPlataforma;
    private double limitePeso;
    private String estado;
    private LocalDate fechaArribo;
    private LocalDate fechaZarpado;
    private int numContenedores;
    private double valorCarga;

    public Buque() {
        this.areaPlataforma = 0;
        this.limitePeso = 0;
        this.estado = "Arribado";
        this.fechaZarpado = null;
        this.fechaArribo = null;
        this.numContenedores = 0;
        this.valorCarga = 0;
    }

    public Buque(double areaPlataforma, double limitePeso, LocalDate fechaArribo, LocalDate fechaZarpado) {
        this.areaPlataforma = areaPlataforma;
        this.limitePeso = limitePeso;
        this.estado = "Arribado";
        this.fechaArribo = fechaArribo;
        this.fechaZarpado = fechaZarpado;
        this.numContenedores = 0;
        this.valorCarga = 0;
    }

    public double getAreaPlataforma() {
        return areaPlataforma;
    }

    public double getLimitePeso() {
        return limitePeso;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getFechaZarpado() {
        return fechaZarpado;
    }

    public LocalDate getFechaArribo() {
        return fechaArribo;
    }

    public int getNumContenedores() {
        return numContenedores;
    }

    public double getValorCarga() {
        return valorCarga;
    }

    public void setAreaPlataforma(double areaPlataforma) {
        this.areaPlataforma = areaPlataforma;
    }

    public void setLimitePeso(double limitePeso) {
        this.limitePeso = limitePeso;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaZarpado(LocalDate fechaZarpado) {
        this.fechaZarpado = fechaZarpado;
    }

    public void setFechaArribo(LocalDate fechaArribo) {
        this.fechaArribo = fechaArribo;
    }

    public void setNumContenedores(int numContenedores) {
        this.numContenedores = numContenedores;
    }

    public void setValorCarga(double valorCarga) {
        this.valorCarga = valorCarga;
    }

    public String cargarContenedor(double area, double peso, double valor) {
        if (this.estado.equals("Zarpado")) {
            return "ERROR.... El buque ya zarpó";
        } else {
            if (this.areaPlataforma - area < 0) {
                return "ERROR.... Se supero el area del buque";
            } else {
                this.areaPlataforma = this.areaPlataforma - area;
                this.limitePeso = this.limitePeso - peso;
                this.valorCarga = this.valorCarga + valor;
                this.numContenedores = this.numContenedores + 1;
                return "OK.... Contenedor cargado con exito";
            }
        }
    }

    public String cargarContenedor(Contenedor contenedor) {
        return this.cargarContenedor(contenedor.getArea(), contenedor.getPeso(), contenedor.getValor());
    }

    public double areaDisponible() {
        return areaPlataforma;
    }

    public double pesoPermitido() {
        return limitePeso;
    }

    public double valorCarga() {
        return valorCarga;
    }

    public int contenedoresCargados() {
        return numContenedores;
    }

    public LocalDate FechaZarpado() {
        return fechaZarpado;
    }
}
