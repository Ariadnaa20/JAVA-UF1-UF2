package ARRAYS;

import java.util.Scanner;

public class ExerciciEXAMEN2 {
    public static void main(String[] args) {
        // Inicialización del escáner y la matriz de 10x10
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[10][10];
        int option;

        // Posicionar los barcos en la matriz según la imagen proporcionada
        // Barco vertical en la columna A (0 en índices)
        for (int i = 0; i < 5; i++) {
            grid[i][0] = 1;
        }
        // Barco horizontal en la fila 4 (3 en índices) desde la columna C a la columna E (2 a 4 en índices)
        for (int i = 2; i <= 4; i++) {
            grid[3][i] = 1;
        }
        // Barco pequeño en la fila 6 (5 en índices) en la columna I (8 en índices)
        grid[5][8] = 1;
        // Barco horizontal en la fila 7 (6 en índices) desde la columna D a la columna G (3 a 6 en índices)
        for (int i = 3; i <= 6; i++) {
            grid[6][i] = 1;
        }
        // Barco horizontal en la fila 9 (8 en índices) desde la columna B a la columna D (1 a 3 en índices)
        for (int i = 1; i <= 3; i++) {
            grid[8][i] = 1;
        }

        // Menú principal
        do {
            System.out.println("\nBenvingut al joc d'Enfonsar la Flota!");
            System.out.println("1. Disparar");
            System.out.println("2. Mostrar taulell");
            System.out.println("3. Sortir");
            System.out.print("Selecciona una opció: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Pedir al usuario la fila y columna para disparar
                    System.out.print("Introdueix la fila (1-10): ");
                    int row = scanner.nextInt() - 1; // Restamos 1 para convertir a índice de matriz
                    System.out.print("Introdueix la columna (A-J): ");
                    char columnChar = scanner.next().toUpperCase().charAt(0); // Convertimos a mayúscula para aceptar tanto minúsculas como mayúsculas
                    int column = columnChar - 'A'; // Convertimos el carácter a un índice numérico

                    if (row < 0 || row >= 10 || column < 0 || column >= 10) {
                        System.out.println("Coordenades fora de rang!");
                    } else if (grid[row][column] == 1) {
                        System.out.println("TOCAT!");
                        grid[row][column] = -2; // Marcamos con -2 si hay un barco
                    } else if (grid[row][column] == 0) {
                        System.out.println("Aigua!");
                        grid[row][column] = -1; // Marcamos con -1 si es agua
                    } else {
                        System.out.println("Ja has disparat en aquesta posició!");
                    }
                    break;
                case 2:
                    // Mostrar el estado actual del tablero
                    for (int i = 0; i < grid.length; i++) {
                        for (int j = 0; j < grid[i].length; j++) {
                            if (grid[i][j] == 0) {
                                System.out.print(". "); // Agua o posición no disparada
                            } else if (grid[i][j] == -1) {
                                System.out.print("* "); // Disparo fallido
                            } else if (grid[i][j] == -2) {
                                System.out.print("X "); // Disparo acertado
                            } else {
                                System.out.print(". "); // Posición con barco no revelada
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Si us plau, introdueix una opció correcta.");
            }
        } while (option != 3);

        scanner.close();
    }

}
