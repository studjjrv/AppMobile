package Ejercicios.Modulo2;

import java.util.Scanner;

public class Ejercicio2_2_Bucles {
    public static void main(String[] args) {
//Ejercicio 2: Realiza un juego para adivinar un numero.
// Para ello genera un numero aleatorio entre 0-100, y luego ir pidiendo numeros indicando
// "es mayor" o "es menor" segun sea mayor o menor con respecto al numero generado al principio.
// El proceso termina cuando el usuario acierta, debe tener 5 intentos

        int aleatorio = (int)(Math.random()*100+1); //CREAMOS EL NÚMERO ALEATORIO ENTRE 1 Y 100
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número y adivina el resultado: ");


        for(int i=0; i<10; i++){
            int numero = entrada.nextInt();
            if(numero < aleatorio){
                System.out.print("INTENO "+(i+1)+" de 10. El número que ingresaste es MENOR, intenta de nuevo => ");
            }else if(numero > aleatorio){
                System.out.print("INTENO "+(i+1)+" de 10. El número que ingresaste es MAYOR, intenta de nuevo => ");
            }else{
                System.out.print("GANASTE... has acertado el número");
                i = 11;
            }
        }



    }
}
