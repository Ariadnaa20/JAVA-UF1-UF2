package AriadnaPascualPalau;

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean esValid = false;
        int numero = 0;


        System.out.println("Benvingut, al comprovador d'enters. ");
        // Bucle per demanar un nuero enter
        while (!esValid) {
            System.out.println("Introdueix un número enter:");

            if (input.hasNextInt()) {
                numero = input.nextInt();   //guardar el numero
                esValid = true; // sortir del bucle si es enter
            } else {
                System.out.println("Has introduït un valor que no és de tipus enter. Aquestes altures " +
                        "ho hauriem de saber eh :)");
                input.next();
            }
        }

        // Comprobar si un numero es multiple de tres
        if (numero % 3 == 0) {  // es la condició amb la que sabrem si es multiple de tres
            System.out.println("Has introduït un número múltiple de 3");
        } else {  // s'executa aquesta part si no es multiple de tres
            System.out.println("Has introduït un número que no és múltiple de 3");
        }

        input.close();
    }
}
