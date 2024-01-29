package aumentoSueldo;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Hugo", 9999, 2022, 3, 20));
        empleados.add(new Empleado("Rafael", 3000, 2020, 4, 14));
        empleados.add(new Empleado("Chavez", 3000, 2020, 12, 1));
        empleados.add(new Empleado("Frias", 3000, 2022, 5, 2));
        empleados.add(new Empleado("yMaduro", 3000, 2022, 1, 27));

        int añoLimite = 2021;

        for (Empleado empleado : empleados) {
            int añoContrato = empleado.dame_fechacontrato().getYear();

            if (añoContrato < añoLimite) {
                empleado.sube_sueldo(5);
            }
        }

        System.out.println("Nombres y sueldos actualizados:");

        for (Empleado empleado : empleados) {
            System.out.println(empleado.dame_nombre() + ": " + empleado.dame_sueldo() + "€");
        }
    }
}