package ARRAYS;

import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector = new int[10];

        System.out.println("Introduce 10 números enteros para el vector:");

        // Leer los elementos del vector
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = input.nextInt();
        }

        // Realizar el desplazamiento una posición hacia la derecha
        int ultimoElemento = vector[9];

        for (int i = 9; i > 0; i--) {
            vector[i] = vector[i - 1];
        }

        vector[0] = ultimoElemento;

        // Mostrar el vector después del desplazamiento
        System.out.println("El vector después del desplazamiento hacia la derecha es:");

        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i] + " ");
        }

        input.close();
    }
}

