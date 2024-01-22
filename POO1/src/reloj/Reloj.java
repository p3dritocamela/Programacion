package reloj;

public class Reloj {
    String marca;
    Boolean digital;
    double precio;
    public Reloj() {
        marca = "TOP G";
        digital = true;
        precio = 999.9;
    }
    public String Tipo() {
        return digital ? "digital" : "analógico";
    }
}