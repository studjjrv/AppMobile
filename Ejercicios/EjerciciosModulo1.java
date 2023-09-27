package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class EjerciciosModulo1 {

    public static void main(String[] args) {

        //EJERCICIO NUMERO 1
        //Hacer un programa que imprima la suma de tres calificaciones
        Scanner notas= new Scanner(System.in);
        float calificacion1, calificacion2, calificacion3, suma, promedio;
        System.out.println("Ingrese tres calificaciones: ");
        calificacion1 = notas.nextFloat();
        calificacion2 = notas.nextFloat();
        calificacion3 = notas.nextFloat();

        suma = calificacion1 + calificacion2 + calificacion3;

        promedio = (suma /3);
        System.out.println("El promedio de notas es: "+promedio);

        promedio = Math.round(promedio);
        System.out.println("El promedio de notas es: "+promedio);

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

        /*EJERCICIO NUMERO 3
            guillermo tiene N dolares. Luis tiene la mitad de lo que posee guillermo.
            juan tiene la mitad de lo que poseen luis y guillermo juntos. hacer un programa que calcule e
            imprima la cantidad de dinero que tiene entre los tres*/

        float guillermo = 0 ,luis = 0, juan = 0, total = 0;
        guillermo = Float.parseFloat(JOptionPane.showInputDialog("¿Cuánto dinero tiene Guillermo?"));
        luis  = guillermo /2;
        juan = (luis + guillermo)/2;
        total = guillermo + luis + juan;
        JOptionPane.showMessageDialog(null, "Guillermo tiene: "+guillermo+" dólares ;Luis tiene: "+ luis +" dólares; y Juan tiene: "+juan+" dólares");

        JOptionPane.showMessageDialog(null, "Entre Guillermo, Juan y Luis hacen un total de: "+ total + " dólares");
















    }


}
