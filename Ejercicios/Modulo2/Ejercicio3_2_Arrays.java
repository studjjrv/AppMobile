package Ejercicios.Modulo2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3_2_Arrays {
    public static void main(String[] args) {

        //Leer por teclado dos arreglos de 10 numeros enteros y mezclarlas en un
        // tercer arrays de la forma: 1 del A, el 1 del B, el 2 del A, el 2 del B, etc.

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Ingrese los primeros 10 numeros: ");
        for(int i=0; i<10; i++){
            array1[i] = entrada1.nextInt();
          
        }
        System.out.println("Ingrese los segundos 10 numeros: ");
        for(int i=0; i<10; i++){
            array2[i] = entrada2.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int[] array3 = new  int[array1.length+array2.length];
        System.arraycopy(array1,0,array3,0,array1.length);
        System.arraycopy(array2,0,array3,array1.length,array2.length);
        Arrays.sort(array3);
        System.out.println((Arrays.toString(array3)));
    }
}
