package ARRAYS;

import java.util.Scanner;

public class exercici3parcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el tamany de la matriu ");  // demanem al usuari el tamany de la matriu
        int n = scanner.nextInt();

        // Crear la matriu d'enters i demanar al usuari els valors corresponents i aixi guardar els codis ASCII
        int[][] matrizNumeros = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Introdueix l'element [" + i + "][" + j + "]: ");
                matrizNumeros[i][j] = scanner.nextInt();
            }
        }

        // Convertir la matriu d'enters a char o lletres proporcionats per l'usuari
        char[][] matrizCaracteres = new char[n][n];
        String palabraDiagonal = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char letra = (char) matrizNumeros[i][j];  //funcio per converir explicada a classe
                matrizCaracteres[i][j] = letra;
                if (i == j) { // estem a la diagonal princiapl
                    palabraDiagonal += letra;
                }
            }
        }

        // Imprimir la matriu de caracters
        System.out.println("Matriu de caracters:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizCaracteres[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimir la paraula encriptada
        System.out.println("La paraula encriptada en la diagonal principal es: " + palabraDiagonal);
    }

    }

    // jo vull posar 'ARI' EN LA DIAGONAL PUES HE DE:
   /* El CODI ASCII de 'A' (65) está en la posició (0,0).
        El CODI ASCII de 'R' (82) está en la posició (1,1).
        El CODI ASCII de 'I' (73) está en la posició (2,2).*/

