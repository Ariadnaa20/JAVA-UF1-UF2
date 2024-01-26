package NADALEXERCICIS.arrays_exercicis;

import java.util.Scanner;

public class Exercici7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int posicioDestijada;

        int[] numeros= new int[10];

        for(int i=0; i< numeros.length; i++){
            System.out.println("Introdueix el numero: " + (i+1) );
            numeros[i]= input.nextInt();
        }

        for(int i= numeros.length-1; i>0 && i< numeros.length; i--){
            for(int j= i-1; j>=0; j--){
                if(numeros[j] > numeros[i]){
                    int cambio= numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=cambio;
                }
            }
        }

        for(int elemento: numeros){
            System.out.println(elemento);
        }

        // busquem un nombre

        System.out.println("Introdueix la posicio destijada");
        posicioDestijada=input.nextInt();
         int posicio= numeros[posicioDestijada];

        System.out.print("El numero es " + posicio + " a la posicio desitjada que ha dit: " + posicioDestijada);



    }
}
