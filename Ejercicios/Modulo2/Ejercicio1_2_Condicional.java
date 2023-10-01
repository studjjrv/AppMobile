package Ejercicios.Modulo2;

import javax.swing.*;

public class Ejercicio1_2_Condicional {
    public static void main(String[] args) {
        //Ejercicio 2: Un obrero necesita calcular su
        // salario semanal, el cual se obtiene de la siguiente manera:
        // -si trabaja 40 horas o menos se le paga 16$ por hora
        //-Si trabaja mas de 40 horas se le paga 16$ por cada una de las primeras
        // 40 horas y 20$ por cada hora extra.

        int horasTrabajadas;
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántas horas a la semana trabajas?: "));

        if(horasTrabajadas <= 40){
            JOptionPane.showMessageDialog(null,"Usted gana 16 dólares (USD) por hora. Esta semana generó: "+horasTrabajadas * 16+" dólares");
        }else{
            int horasExtras = horasTrabajadas - 40;
            horasTrabajadas = horasTrabajadas - horasExtras;
            int total = (horasTrabajadas * 16) + (horasExtras * 20);

            JOptionPane.showMessageDialog(null,"Por tus primeras 40 horas de trabajo generastes "+horasTrabajadas*16+" dólares.");
            JOptionPane.showMessageDialog(null,"Por tus "+horasExtras+" horas extras generastes "+horasExtras*20+" dólares");
            JOptionPane.showMessageDialog(null,"En total hicistes "+total+" dólares esta semana");

        }
    }
}
