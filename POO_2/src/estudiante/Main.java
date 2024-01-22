package estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante me = new Estudiante();

        System.out.println("Nombre: " + me.dime_nombre());
        System.out.println("Edad: " + me.dime_edad());
        System.out.println("Calificación: " + me.dime_calificacion());

        me.establece_edad();
        me.establece_calificacion();
    }
}