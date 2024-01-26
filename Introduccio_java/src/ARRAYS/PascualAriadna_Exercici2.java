package ARRAYS;

import java.util.Scanner;

public class PascualAriadna_Exercici2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);  // declarem scanner

        //VARIBALES
        /* les variables serán utilitzades al llarg del codi.
         * Es important inicialitzarles amb els seus corresponents valors:   */

        int opcio=0;
        boolean movimentValid= false;



        //CODI (MENÚ) + el que demanes al enunciat

        System.out.println("Benvingut al programa : Juga als ESCACS");
        System.out.println(" Vinga doncs començem" + ":)");

        char[][] tablero = {
                /*HE DECIDIT FER-HO AMB MAYUSCULA PER A LES  FIGURES O FICHES NEGRES*/

                {'R', 'C', 'A', 'D', 'R', 'A', 'C', 'D'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {'r', 'c', 'a', 'd', 'r', 'a', 'c', 'd'}


                /* HE DECIDIT FER-HO AMB MINÚSCULA PER A LES FIGURES O FICHES BLANQUES*/
        };

        // Ara mostro el tabler original i també amb els guionets on no hi ha cap peça/posició.

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == ' ') {
                    System.out.print('-');
                } else {
                    System.out.print(tablero[i][j]);
                }
                System.out.print(' ');
            }
            System.out.println();
        }

        // DO WHILE I DINS UN MENÚ AMB LES OPCIONS MOURE PEÇA I SORTIR


        do {  // un do while per a que no s'acabi fins que l'usuari no seleccioni sortir. No se si ho demanaves pero te sentit.
            System.out.println("\nMenú:");
            System.out.println("1. Moure peça");
            System.out.println("2. Sortir");
            System.out.print("Seleccioni una opció: ");

            opcio = input.nextInt(); // llegeixo l'opció del usuari

            switch (opcio) {   // un menú tal com hem aprés a classe
                case 1:
                    // L'opció 1 es Moure peça
                    System.out.println("Introdueix las coordenades de la peça a moure (fila i columna): ");
                    int filaOrigen = input.nextInt();
                    int columnaOrigen = input.nextInt();

                    System.out.println("Introdueix las coordenadas de destí (fila i columna): ");
                    int filaDestino = input.nextInt();
                    int columnaDestino = input.nextInt();

                    char peca = tablero[filaOrigen][columnaOrigen]; // assigno posició a peça

                    // Implementar lógica de validació per a cada peça nomes las que demanaves PEÓ(P) I CAVALL (C). Et faig un altre switch per tenirho mes ordenat.
                    switch (peca) {
                        case 'C': // Caball
                            // Calculem la diferència entre filas i columnas
                            int filaDiferencia = Math.abs(filaDestino - filaOrigen); /* Francesc, la funció Math.abs() la he utlitzat per a obtenir el valor absolut d'aquesta diferència, aixi m'asseguro que sigui positiva.*/
                            int columnaDiferencia = Math.abs(columnaDestino - columnaOrigen);

                            if ((filaDiferencia == 2 && columnaDiferencia == 1 || filaDiferencia == 1 && columnaDiferencia == 2) &&
                                    tablero[filaDestino][columnaDestino] == ' ') {
                                movimentValid = true;
                            } else {
                                System.out.println("Moviment no válid. La posició de destí no es accesible per al caball.");
                            }
                            break;

                        case 'P': // Peó
                            // Lógica para validar movimient del peó. Nomes avançar una posició al davant.

                            if (filaDestino == filaOrigen + 1 && columnaDestino == columnaOrigen && tablero[filaDestino][columnaDestino] == ' ') {
                                movimentValid = true;
                            } else {
                                System.out.println(" EPAAA, Moviment no válid. Hi ha una peça bloquejant que avançis.");
                            }
                            break;


                        default:
                            System.out.println("Peça no reconeguda. Movimient no válid.");
                            continue;
                    }

                    // Realitzar el moviment
                    tablero[filaDestino][columnaDestino] = tablero[filaOrigen][columnaOrigen];
                    tablero[filaOrigen][columnaOrigen] = ' ';
                    System.out.println("¡Movimment realitzat amb éxit!");


                    // Mostrar el tabler després del moviment
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            System.out.print(tablero[i][j] + " "); //imprimim
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Sortint del programa. Ens veiem. Espero que t'hagi agradat el joc" + ":) ....");
                    break;
                default:
                    System.out.println("Opció no vàlida. Siusplau, escull una opció correcta.");
            }
        } while (opcio != 2);


        /* el punt extra esta en els casos del switch cas C I P. Suposo que nomes et refereixes
        a que ho comprovem nomes a aquestes dues peçes.
         */


    }
}
