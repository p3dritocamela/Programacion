package listaempleado;


import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Napoleon", 3000.0, 2022, 1, 20));
        listaEmpleados.add(new Empleado("Bonaparte", 1.0, 2022, 6, 7));
        listaEmpleados.add(new Empleado("Enano", 25000.0, 2022, 9, 4));

        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.dame_nombre() + ", Sueldo: " + empleado.dame_sueldo() + "€, Fecha de contrato: " + empleado.dame_fechacontrato());
        }
    }
}