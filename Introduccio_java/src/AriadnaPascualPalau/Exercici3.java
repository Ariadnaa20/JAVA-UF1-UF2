package AriadnaPascualPalau;

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Siusplau, introdueix l'altura del arbre: ");
        int altura = scanner.nextInt();
        scanner.close();

        // Verificar que l'altura sigui suficient
        if (altura < 3) {
            System.out.println("l'altura ha de ser minim 3.");
            return;
        }

        //  La base del arbre es el doble de la altura + 1
        int base = (2 * altura) + 1;

        // array bidimensional per crear l'arbre
        char[][] arbol = new char[altura][base];

        // Inicialitzem l'arbre amb espais
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                arbol[i][j] = ' ';
            }
        }

        // construim l'arbre amb asteriscos
        int centro = base / 2;
        for (int i = 0; i < altura; i++) {
            for (int j = centro - i; j <= centro + i; j++) {
                arbol[i][j] = '*';
            }
        }

        // afegim el missatge  "BON NADAL"
        String mensaje = "BON NADAL";
        int inicioMensaje = centro - (mensaje.length() / 2);
        for (int i = 0; i < mensaje.length(); i++) {
            arbol[altura / 2][inicioMensaje + i] = mensaje.charAt(i);
        }

        // Imprimim l'arbre
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(arbol[i][j]);
            }
            System.out.println();
        }
    }
}


