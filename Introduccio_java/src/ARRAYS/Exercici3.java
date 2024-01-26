package ARRAYS;

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[5];
        double sumaPositivos = 0;
        double sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        System.out.println("Por favor, introduce 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextDouble();

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        input.close();

        if (contadorPositivos > 0) {
            double mediaPositivos = sumaPositivos / contadorPositivos;
            System.out.println("Media de números positivos: " + mediaPositivos);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        if (contadorNegativos > 0) {
            double mediaNegativos = sumaNegativos / contadorNegativos;
            System.out.println("Media de números negativos: " + mediaNegativos);
        } else {
            System.out.println("No se introdujeron números negativos.");
        }

        System.out.println("Número de ceros introducidos: " + contadorCeros);
    }
}


