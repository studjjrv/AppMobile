package Ejercicios.Modulo2;

import javax.swing.*;

public class Ejercicio1_1_Condicional {
    public static void main(String[] args) {
        //Ejercicio 1: hacer un programa que lea un numero entero y muestre
        // si el numero es multiplo de 10

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un número: "));
        if(numero % 10 == 0){
            JOptionPane.showMessageDialog(null,"El número "+numero+" es múltiplo de 10");

        }else{
            JOptionPane.showMessageDialog(null,"El número "+numero+" NO es múltiplo de 10");

        }

    }
}
