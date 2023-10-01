package Ejercicios.Modulo1;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio1 {

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
    }
}
