package ARRAYS;

import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        int[] vectorMezclado = new int[20]; // El tercer vector tendrá el doble de tamaño

        // Leer los elementos del primer vector
        System.out.println("Introduce 10 números para el primer vector:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = input.nextInt();
        }

        // Leer los elementos del segundo vector
        System.out.println("Introduce 10 números para el segundo vector:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = input.nextInt();
        }

        // Mezclar los vectores en el tercer vector
        int indiceVectorMezclado = 0;
        for (int i = 0; i < 10; i++) {
            vectorMezclado[indiceVectorMezclado++] = vector1[i];
            vectorMezclado[indiceVectorMezclado++] = vector2[i];
        }

        // Mostrar el tercer vector mezclado
        System.out.println("El tercer vector mezclado es:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vectorMezclado[i] + " ");
        }

        input.close();
    }

    }

