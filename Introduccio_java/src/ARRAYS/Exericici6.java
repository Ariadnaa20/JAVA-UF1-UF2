package ARRAYS;

import java.util.Scanner;

//foto pisarra pasar als apunts :
public class Exericici6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Llegir els 10 números enters
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Llegir la posicio a eliminar
        System.out.println("Introduce la posición del elemento a eliminar (0-9):");
        int posicion = scanner.nextInt();

        // Valida la posicio i elimina l'element
        if (posicion >= 0 && posicion < 10) {
            for (int i = posicion; i < numeros.length - 1; i++) {
                numeros[i] = numeros[i + 1];
            }
            numeros[numeros.length - 1] = -1;

            // Imprimir el array
            System.out.println("Array final:");
            for (int i = 0; i < numeros.length - 1; i++) {
                System.out.print(numeros[i] + (i < numeros.length - 2 ? ", " : ""));
            }
        } else {
            System.out.println("Posición inválida."); //opció per si no es valida
        }
    }
}
