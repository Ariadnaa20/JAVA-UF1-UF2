package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego del ahorcado!");
        System.out.println("Intenta adivinar la palabra o frase.");

        // Paraula o frase per jugar
        String frase = "Forrest Gump";

        // Pista: primer carácter de la palabra o frase
        char pista = frase.charAt(0);

        // Sequencia inicial
        char[] secuenciaAdivinada = new char[frase.length()];  // creem la array de chars amb la frase per aixi actuar lletra per lletra
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                secuenciaAdivinada[i] = ' ';
            } else if (i == 0) {
                secuenciaAdivinada[i] = pista;
            } else {
                secuenciaAdivinada[i] = '*';
            }
        }

        // Bucle principal del joc
        while (true) {


            System.out.println("Palabra o frase: " + String.valueOf(secuenciaAdivinada));



            System.out.print("Introduce una letra: ");
            char letraSugerida = input.next().charAt(0);  // que l'usuari t'introdueixi una lletra


            boolean acertado = false;
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == letraSugerida) {
                    // Actualizar la secuencia adivinada
                    secuenciaAdivinada[i] = letraSugerida; //actualizem la lletra a la posicio i de la sequència
                    acertado = true;
                }
            }

            // missatge si s'ha trobat o no
            if (acertado) {
                System.out.println("¡Bien hecho! La letra está en la palabra.");
            } else {
                System.out.println("Lo siento, la letra no está en la palabra.");
            }


            if (Arrays.equals(secuenciaAdivinada, frase.toCharArray())) {  // si la paraula es troba
                System.out.println("\n¡Felicidades! Has adivinado la palabra.");
                break;
            }

        }

        input.close();
        }

    }

