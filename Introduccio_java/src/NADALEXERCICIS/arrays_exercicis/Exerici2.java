package NADALEXERCICIS.arrays_exercicis;

import java.util.Scanner;

public class Exerici2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;

        int[] numeros= new int[5];

        for(int i=0; i<numeros.length; i++){
            System.out.println("Introdueix 5 nombres");
            num=input.nextInt();
            numeros[i]=num;
        }

        for(int i=4; i<numeros.length && i>-1; i--){
            System.out.println("Indice: " + i + " numero " + numeros[i]);

        }
    }
}

// enunciat: Leer 5 números por teclado, guardarlos en un vector y mostrarlos en orden inverso al introducido.