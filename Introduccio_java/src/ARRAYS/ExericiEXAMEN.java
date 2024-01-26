package ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;

public class ExericiEXAMEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numerosComprats = new ArrayList<>();
        int opcio;
        int nombreButlletes;
        int numero;
        int premi;
        boolean sortir = false;

        while (!sortir) {
            System.out.println("Benvingut a La Grossa de Cap d'Any!");
            System.out.println("1. Comprar butlletes");
            System.out.println("2. Sortir");
            System.out.print("Selecciona una opció: ");
            opcio = input.nextInt();

            switch (opcio) {
                case 1:
                    premi = 0;
                    numerosComprats.clear();
                    ArrayList<Integer> numerosGuanyadors = new ArrayList<>();

                    do {
                        System.out.print("Quantes butlletes vols comprar (1-3)? ");
                        nombreButlletes = input.nextInt();
                    } while (nombreButlletes < 1 || nombreButlletes > 3);

                    for (int i = 0; i < nombreButlletes; i++) {
                        do {
                            System.out.print("Introdueix un número (00000 - 99999) per a la butlleta " + (i + 1) + ": ");
                            numero = input.nextInt();
                        } while (numero < 0 || numero > 99999 || numerosComprats.contains(numero));
                        numerosComprats.add(numero);
                    }

                    // Generació de números guanyadors
                    while (numerosGuanyadors.size() < 10) {
                        int valorGuanyador = (int) (Math.random() * 100000);
                        if (!numerosGuanyadors.contains(valorGuanyador)) {
                            numerosGuanyadors.add(valorGuanyador);
                        }
                    }

                    // Comprovació dels números i càlcul del premi
                    for (int num : numerosComprats) {
                        if (numerosGuanyadors.contains(num)) {
                            premi += 200000;
                        }
                    }

                    // Resultat
                    int balanc = premi - (nombreButlletes * 10);
                    System.out.println("Números Guanyadors: " + numerosGuanyadors);
                    System.out.println("Els teus números: " + numerosComprats);
                    System.out.println("El teu premi és: " + premi + "€");
                    System.out.println("El teu balanç final és: " + balanc + "€");

                    break;

                case 2:
                    sortir = true;
                    break;

                default:
                    System.out.println("Opció no vàlida. Si us plau, introdueix una opció correcta.");
            }
        }

        input.close();


    }
}