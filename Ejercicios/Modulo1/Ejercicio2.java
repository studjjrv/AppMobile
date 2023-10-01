package Ejercicios.Modulo1;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

         /*EJERCICIO NUMERO 2
            hacer un programa que calcule e imprima el salario semanal de un
            empleado a partir de sus horas semanales trabajadas y de su salario por hora*/

        float salarioSemanal;
        float salario;
        int horasTrabajadas;

        salario = Float.parseFloat(JOptionPane.showInputDialog("¿Cuánto ganas por hora?"));
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas horas al día trabajas?"));

        salarioSemanal = salario * horasTrabajadas;

        JOptionPane.showMessageDialog(null, "Usted gana " + salarioSemanal + " dólares la semana");

    }
}
