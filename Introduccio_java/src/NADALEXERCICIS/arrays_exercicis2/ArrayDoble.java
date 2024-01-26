package NADALEXERCICIS.arrays_exercicis2;

import java.util.Scanner;

public class ArrayDoble {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] numeros= new int[5];
        int[] numerosDoble= new int[5];

        for(int i=0; i< numeros.length; i++){
            System.out.print("Siusplau, introdueix el nombre " + (i+1) + " : ");
            numeros[i]=input.nextInt();
        }

        for(int elemento: numeros){
            System.out.println("L'element es: " + elemento);
        }

        for(int i=0; i<numerosDoble.length; i++){
            numerosDoble[i] = numeros[i] + numeros[i]; // o numerosDoble[i] = numeros[i] * 2;

        }

        System.out.println("EL ARRAY DELS NUMEROS DOBLES ES: ");

        for(int elementoDoble: numerosDoble){
            System.out.println("L'element es: " + elementoDoble);
        }




    }
}
