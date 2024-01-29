package Ejercicio1;

import javax.swing.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
    public static void main(String[] args){

        Empleado empleado = new Empleado(
                JOptionPane.showInputDialog("Ingrese el nombre del empleado:"),
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado:")),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de contratación del empleado:")),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de contratación del empleado:")),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de contratación del empleado:"))
        );
        empleado.sube_Sueldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de aumento del sueldo:")));

        String info = "Nombre: " + empleado.dime_Nombre() + "\n" +
                "Sueldo: " + empleado.dime_Sueldo() + "\n" +
                "Fecha de contratación: " + empleado.dime_Alta_contrato();

        JOptionPane.showMessageDialog(null, info, "Información del empleado", JOptionPane.INFORMATION_MESSAGE);

    }
}

class Empleado{


    private String nombre;
    private double sueldo;
    private Date alta_contrato;
    public Empleado(String nomb, double sue,
                    int agno, int mes, int dia){

        nombre=nomb;
        sueldo=sue;
        alta_contrato = new GregorianCalendar(agno, mes - 1, dia).getTime();

    }

    public String dime_Nombre() {
        return nombre;
    }


    public Date dime_Alta_contrato() {
        return alta_contrato;
    }


    public double dime_Sueldo() {
        return sueldo;
    }
    public void sube_Sueldo(double porcentaje) {
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }



}