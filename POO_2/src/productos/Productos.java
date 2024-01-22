package productos;
public class Productos {
    private String nombre;
    private double precio;
    private int stock;
    public Productos() {
        nombre = "arroz";
        precio = 2.0;
        stock = 10;
    }
    public void establece_stock() {
        if (stock < 0) {
            System.out.println("Error, el stock no puede ser negativo.");
        }
    }
    public String dime_nombre() {
        return nombre;
    }
    public double dime_precio() {
        return precio;
    }
    public int dime_stock() {
        return stock;
    }
}