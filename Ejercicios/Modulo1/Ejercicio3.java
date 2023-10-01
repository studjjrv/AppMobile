package Ejercicios.Modulo1;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
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
