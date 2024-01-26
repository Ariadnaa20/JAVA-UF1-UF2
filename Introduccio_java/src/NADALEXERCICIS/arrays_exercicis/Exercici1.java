package NADALEXERCICIS.arrays_exercicis;

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;

        int[] numeros= new int[5];

        for (int i=0; i<numeros.length; i++){
            System.out.println("Introdueix 5 nombres");
            num=input.nextInt();
            numeros[i]=num;
        }

        for(int i= 0; i<numeros.length; i++){
            System.out.println("El index: " + i + " està el nombre: " + numeros[i]);
        }
    }
}

/*Leer 5 números por teclado, guardarlos en un vector y  mostrarlos en el mismo orden introducido. (Utilizaremos un
bucle para pedir los valores al usuario y guardarlos al vector; y otro bucle para mostrarlos).
*/