package Ejercicios.Modulo2;

import java.util.Scanner;

public class Ejercicio2_1_Bucles {

    public static void main(String[] args) {

        //Bucles:
        //Ejericio 1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se
        // instroduzca un numero negativo

        Scanner entrada = new Scanner(System.in);
        int numero =0;
        System.out.println("Ingrese un número para cáclular su cuadrado: ");
        numero = entrada.nextInt();
        while (numero >= 0) {
            System.out.println("Ingrese otro: ");
            numero = entrada.nextInt();
            System.out.println("El cuadrado del número "+numero+" es "+numero*numero);
        }
    }
}

