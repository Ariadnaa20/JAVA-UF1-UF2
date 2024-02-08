package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Menuprincipal();
    }

    public static int Menuprincipal() {
        int[] valors = IntrodueixValors();
        int opcio = MenuCalculadora();
        Calculadora(opcio, valors);

        return opcio;
    }

    public static int[] IntrodueixValors() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix 2 valors");
        int[] numeros = new int[2];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Intrpdueix el primer nombre " + (i + 1));
            numeros[i] = input.nextInt();
        }

        return numeros;
    }

    public static int MenuCalculadora() {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecciona una opció:");
        System.out.println("1. Suma\n2. Resta\n3. Producte\n4. Divisió\n5. Exponencial");
        return input.nextInt();

    }


    public static int Calculadora(int opcio, int [] valors) {
        Scanner input = new Scanner(System.in);
        switch (opcio) {
            case 1:
                System.out.println("Resultat de la suma: " + suma(valors[0], valors[1]));
                break;
            case 2:
                System.out.println("Resultat de la resta: " + resta(valors[0], valors[1]));
                break;
            case 3:
                System.out.println("Resultat del producte: " + producte(valors[0], valors[1]));
                break;
            case 4:
                System.out.println("Resultat de la divisió: " + divisio(valors[0], valors[1]));
                break;
            case 5:
                System.out.println("Resultat de l'exponencial: " + exponencial(valors[0], valors[1]));
                break;
            default:
                System.out.println("Opció no vàlida");
                break;
        }

        return opcio;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int producte(int a, int b) {
        return a * b;
    }

    public static double divisio(int a, int b) {
        if (b == 0) {
            System.out.println("No es pot dividir per zero");
            return 0;
        } else {
            return (double) a / b;
        }
    }

    public static double exponencial(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}

