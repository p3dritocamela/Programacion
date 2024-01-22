package coche;

public class Coche {
    private String marca, modelo;
    public Coche() {
        marca = "Audi";
        modelo = "TOP G";
    }
    public String dime_marca() {
        return marca;
    }
    public String dime_modelo() {
        return modelo;
    }
}