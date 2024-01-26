package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contadorPalabras = 0;
        int contadorVocales = 0;

        System.out.println("Introduce un texto (termina con un punto): ");
        String texto = input.nextLine();


        String[] palabras = texto.split(" "); //separarar les paraules en espais
        contadorPalabras = palabras.length;

        // Contar vocals
        for (int i = 0; i < texto.length(); i++) {
            char caracter = Character.toLowerCase(texto.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("El texto tiene " + contadorPalabras + " palabras.");
        System.out.println("El texto tiene " + contadorVocales + " vocales.");

        input.close();

    }
}
