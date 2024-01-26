package NADALEXERCICIS.arrays_exercicis2;

import java.util.Scanner;

public class SumaArrays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sumaNumeros = 0;

        int[] numeros= new int[5];

        for(int i=0; i< numeros.length ; i++){
            System.out.print("Introdueix el nombre: " + (i+1) + " : ");
            numeros[i]=input.nextInt();
        }

        for(int elemento: numeros){
            System.out.println("Número: " + elemento);
        }

        for(int i=0; i< numeros.length ; i++){
            sumaNumeros += numeros[i];
        }


        System.out.println("La suma es: " + sumaNumeros);




    }
}
