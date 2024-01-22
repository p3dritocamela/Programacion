package productos;
public class Main {
        public static void main(String[] args) {
            Productos arroz = new Productos();

            System.out.println("El " + arroz.dime_nombre() + " tiene un precio de " + arroz.dime_precio() + "€ y hay " + arroz.dime_stock() + " en stock.");

            arroz.establece_stock();
        }
}