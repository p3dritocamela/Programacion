package b_a;

public class Main {
    public static void main(String[] args) {
        BA miCuenta = new BA();
        System.out.println("Titular: " + miCuenta.dime_titular());
        System.out.println("Saldo: " + miCuenta.dime_saldo());
        miCuenta.establecer_saldo();
    }
}