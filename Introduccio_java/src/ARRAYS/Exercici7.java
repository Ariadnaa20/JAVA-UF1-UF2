package ARRAYS;

import java.util.Scanner;

public class Exercici7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[10];

            System.out.println("Insereix 10 num enters en ordre creixent");

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = scanner.nextInt();

                // comprovar que els num estiguin en format creixent
                if (i > 0 && numeros[i] < numeros[i - 1]) {
                    System.out.println(" El num ha de ser mes gran o igual que el anterior.Intenta-ho de nu:");
                    i--;
                }
            }

            System.out.println("Ingresa el num per buscar");
            int n = scanner.nextInt();

            // Función buscarNumero dentro del main
            int posicion = -1;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == n) {
                    posicion = i; // Retornar la posicio que en que es troba
                    break;
                }
            }

            if (posicion == -1) {
                System.out.println("El número " + n + " no está.");
            } else {
                System.out.println("El número " + n + " está en la posición: " + posicion);
            }
        }


}
