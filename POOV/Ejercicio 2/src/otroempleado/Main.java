package otroempleado;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Pedrito", 3000.0, 2024, 12, 1);
        Empleado empleado2 = new Empleado("Marquitos", 3000.0, 2020, 1, 15);

        System.out.println("Nombre: " + empleado1.dame_nombre());
        System.out.println("Sueldo: " + empleado1.dame_sueldo() + "€");
        System.out.println("Fecha de contrato: " + empleado1.dame_fechacontrato());
        System.out.println();

        empleado2.subeSueldo(10);

        System.out.println("Nombre: " + empleado2.dame_nombre());
        System.out.println("Sueldo: " + empleado1.dame_sueldo() + "€");
        System.out.println("Fecha de contrato: " + empleado2.dame_fechacontrato());
        System.out.println("Nuevo sueldo de " + empleado2.dame_nombre() + ": " + empleado2.dame_sueldo() + "€");
    }
}