package ARRAYS;

import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Por favor, introduce 5 números:");

        // Leer 5 números e almacenarlos en el vector
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostrar los números en orden inverso al introducido
        System.out.println("Los números en orden inverso son:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Número " + (5 - i) + ": " + numeros[i]);
        }

        input.close(); // Cerrar el objeto Scanner cuando ya no se necesita
    }
}

