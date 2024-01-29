package otrootroempleado;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Nicolas", 5000.0, 1998, 1, 1);
        Empleado empleado2 = new Empleado("Maduro", 3000.0, 2021, 4, 19);
        Empleado empleado3 = new Empleado("Hugo", 3000.0, 2042, 3, 2);
        Empleado empleado4 = new Empleado("Chavez", 3000.0, 2000, 5, 4);



        System.out.println("Nombre: " + empleado1.dame_nombre());
        System.out.println("Sueldo: " + empleado1.dame_sueldo() + "€");
        System.out.println("Fecha de contrato: " + empleado1.dame_fechacontrato());
        System.out.println();


        empleado2.subeSueldo(10);


        System.out.println("Nombre: " + empleado2.dame_nombre());
        System.out.println("Sueldo: " + empleado1.dame_sueldo() + "€");
        System.out.println("Fecha de contrato: " + empleado2.dame_fechacontrato());
        System.out.println("Nuevo sueldo de " + empleado2.dame_nombre() + ": " + empleado2.dame_sueldo() + "€");
        System.out.println();


        System.out.println("Nombre: " + empleado3.dame_nombre());
        System.out.println("Sueldo: " + empleado3.dame_sueldo() + "€");
        System.out.println("Fecha de contrato: " + empleado3.dame_fechacontrato());
        System.out.println();

        System.out.println("Nombre: " + empleado4.dame_nombre());
        System.out.println("Sueldo: " + empleado4.dame_sueldo() + "€");
        System.out.println("Fecha de contrato: " + empleado4.dame_fechacontrato());
        System.out.println();

        if (empleado3.dame_fechacontrato().isBefore(empleado4.dame_fechacontrato())) {
            System.out.println(empleado3.dame_nombre() + " fue contratado/a antes que " + empleado4.dame_nombre());
        } else if (empleado3.dame_fechacontrato().isAfter(empleado4.dame_fechacontrato())) {
            System.out.println(empleado4.dame_nombre() + " fue contratado/a antes que " + empleado3.dame_nombre());
        } else {
            System.out.println(empleado3.dame_nombre() + " y " + empleado4.dame_nombre() + " fueron contratados el mismo día");
        }
    }
}