package NADALEXERCICIS.arrays_exercicis;

import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] array1= new int[10];
        int[] array2= new int[10];
        int[] arrayMezcla= new int[20];


        // ARRAY 1
        System.out.println("ARRAY 1");

        for(int i=1; i<array1.length; i++){
            System.out.println("Introdueix un nombre: ");
            array1[i]=input.nextInt();
        }

        for(int i=1; i<array1.length; i++){
            System.out.println(array1[i]);
        }

        // ARRAY 2
        System.out.println("ARRAY 2");

        for(int j=1; j<array2.length; j++){
            System.out.println("Introdueix un nombre: ");
            array2[j]=input.nextInt();
        }

        for(int j=1; j<array2.length; j++){
            System.out.println(array2[j]);
        }


        // ARRAY MEZCLADO
        /*primer hem de pensar que hem de crear una variable indice.
        necesitamos asegurarnos de que cada elemento vaya a una posición única y no se sobrescriba*/
        int indiceMezca=0;

        for(int k=0; k<arrayMezcla.length; k++){
            arrayMezcla[indiceMezca]=array1[k]; // assigem el indice 0 de array1 a indice mezcla o;
            indiceMezca++; // agumentem el index per a que el seguent element estigui al indice 1

            arrayMezcla[indiceMezca]= array2[k]; // assigem el numero del indice 0 de array 2 a indice 1 de array mezcla...
            indiceMezca++; // ara el indice valdrà 1
        }


        // Mostrar el ARRAY MEZCLADO
        System.out.println("ARRAY MEZCLADO");

        for (int k = 0; k < arrayMezcla.length; k++) {
            System.out.println(arrayMezcla[k]);
        }






















        // ARRAY MEZCLADO MAL

        /*for(int k=1; k<arrayMezcla.length; k++){
            for(int i=1; i < array1.length; i++){
                for(int j= 1; j<array2.length; j++){
                    System.out.println("Elemento " + (i + 1) + array1[i]);
                    System.out.println("Elemento " + (i + 1) + array2[i]);

                }
            }

        }*/


    }
}
