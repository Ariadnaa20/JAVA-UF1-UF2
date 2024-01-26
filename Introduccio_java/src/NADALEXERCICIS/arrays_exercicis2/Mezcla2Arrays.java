package NADALEXERCICIS.arrays_exercicis2;

import java.util.Scanner;

public class Mezcla2Arrays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] numeros= new int[5];

        System.out.println("ARRAY 1");
        for(int i=0; i< numeros.length ; i++){
            System.out.print("Introdueix el nombre: " + (i+1) + " : ");
            numeros[i]=input.nextInt();
        }

        for(int elemento: numeros){
            System.out.println("Número: " + elemento);
        }

        System.out.println("ARRAY 2");
        int[] numeros2= new int[5];


        for(int i=0; i< numeros2.length ; i++){
            System.out.print("Introdueix el nombre: " + (i+1) + " : ");
            numeros2[i]=input.nextInt();
        }

        for(int elemento: numeros2){
            System.out.println("Número: " + elemento);
        }


        int[] arrayMezclada= new int[10];
        int indiceMezca=0;

        for( int i=0; i<arrayMezclada.length; i++){
            arrayMezclada[indiceMezca]=numeros[i]; // assigem el indice 0 de numeros a indice de array mezcla;
            indiceMezca++; // agumentem el index per a que el seguent element estigui al indice 1

            // ara indice valdra 1

            arrayMezclada[indiceMezca]= numeros2[i]; // assigem el numero del indice 0 de array 2 a indice 1 de array mezcla...
            indiceMezca++; // ara el indice valdrà 1
        }

        for(int elemento: arrayMezclada){
            System.out.println("Número: " + elemento);
        }



    }
}
