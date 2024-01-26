package ARRAYS;

import java.util.Scanner;

public class exercici1parcial {
    public static void main(String[] args) {
        //DECLAREM VARIABLES
        Scanner input=new Scanner(System.in);
        System.out.println("Benvingut, al teu vector");

        int[] numeros = new int[20];
        int suma = 0;
        double media;
        int contadorMenorMedia = 0;
        int contadorMayorMedia = 0;

        // Llegim els 20 num negatius
        for (int i = 0; i < numeros.length; ) {
            System.out.print("Introdueix un número negativo: ");
            int numero = input.nextInt();

            // Validem que el número sigui negatiu
            if (numero < 0) {
                numeros[i] = numero * numero; // Elevar al quadrat
                suma += numeros[i]; // Sumar al total
                i++;
            } else {
                System.out.println("El numero ha de ser negatiu ");
            }
        }

        //  Ara que hem validad hem de calcular la mitja
        media = (double) suma / numeros.length;

        // Contar els numeros menors i majors que la mitja
        for (int numero : numeros) {
            if (numero < media) {
                contadorMenorMedia++;
            } else if (numero > media) {
                contadorMayorMedia++;
            }
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Números menors que la mitja " + contadorMenorMedia);
        System.out.println("Números mayores que la mitja: " + contadorMayorMedia);


        // Ara que hem calculat la mitja, hem de imprimir. T'ho imprimeixo primer amb un for
        System.out.println("Vector resultant:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // i tambe crec no se si esta be t'ho faig aixi:
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();



    }
}
