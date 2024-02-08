package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercici2 {
    public static void main(String[] args) {
        MenuPrinipal();

    }

    public static void MenuPrinipal(){
        int[] numerosUsuari = IntrodueixNombres();

        int[] numerosPrimitiva = generarNumerosPrimitiva();

        int aciertos = calcularAcerts(numerosUsuari, numerosPrimitiva);

        System.out.println("El numero d'acerts es: " + aciertos);

    }

    public static int[] IntrodueixNombres() {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introdueix numero " + (i + 1));
            numeros[i] = input.nextInt();

            // Validar que el número esté en el rango correcto
            while (numeros[i] < 0 || numeros[i] > 49) {
                System.out.println("Número inválido. Debe estar entre 0 y 49.");
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = input.nextInt();
            }
        }

        return numeros;
    }



    public static int[] generarNumerosPrimitiva(){
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ThreadLocalRandom.current().nextInt(0, 50); // Genera un número aleatorio entre 0 y 49.
        }
        return numeros;
    }


    public static int calcularAcerts (int[] usuario, int[] generarNumerosPrimitiva){
        int acerts= 0;
        // Iterar sobre cada número seleccionado por el usuario
        for (int i = 0; i < usuario.length; i++) {
            // Comparar con cada número de la primitiva
            for (int j = 0; j < generarNumerosPrimitiva.length; j++) {
                if (usuario[i] == generarNumerosPrimitiva[j]) { // Si hay coincidencia
                    acerts++; // Incrementa el contador de aciertos
                    break; // Rompe el bucle interno para evitar contar duplicados
                }
            }
        }


        return acerts;

    }
}
