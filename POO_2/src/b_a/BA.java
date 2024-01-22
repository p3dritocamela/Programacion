package b_a;
public class BA {
    private String titular;
    private double saldo;

    public BA() {
        titular = "Top G";
        saldo = 999.0;
    }
    public void establecer_saldo() {
        if (saldo < 0) {
            System.out.println("Error, el saldo no puede ser negativo.");
        }
    }
    public String dime_titular() {
        return titular;
    }
    public double dime_saldo() {
        return saldo;
    }
}