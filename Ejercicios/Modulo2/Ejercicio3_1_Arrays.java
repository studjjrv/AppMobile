package Ejercicios.Modulo2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3_1_Arrays {
    public static void main(String[] args) {
        //Leer 5 numero por teclado, almacenarlos en un arreglo y a continuacion realizar
        // la media de los numeros positivos, la media de los numeros negativos y contar
        // el numero de ceros

        int[] numeros = new int[5];
        int ceros = 0, contador = 0, longitudPlus = 0, longitudMenos = 0;
        float positivos = 0, negativos = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cinco números: ");
        for(int i=0; i<5; i++){
            numeros[i]= Integer.parseInt(entrada.next());
            if(numeros[i] >0){
                positivos += numeros[i];
                longitudPlus += contador + 1;
            }else if(numeros[i]<0){
                negativos += numeros[i];
                longitudMenos += contador+1;
            }else{
                ceros += contador+1;
            }
        }
        System.out.println("Arrays: "+Arrays.toString(numeros));
        System.out.println("Media positivos: "+positivos/longitudPlus);
        System.out.println("Media negativos: "+negativos/longitudMenos);
        System.out.println("Cantidad de ceros: "+ceros);
    }
}
