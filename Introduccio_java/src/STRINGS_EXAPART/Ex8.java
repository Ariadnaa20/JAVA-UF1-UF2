package STRINGS_EXAPART;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int longitudMaxima = 0;
        String paraulaLlarga = " ";


        System.out.println("Introdueix la quantitat de paraules que vols introduir: ");
        int n_paraules = input.nextInt();
        input.nextLine();

        String[] ArrayParaules = new String[n_paraules];

        for (int i = 0; i < ArrayParaules.length; i++) {
            System.out.println("Les paraules son: " + (i + 1) + " : ");
            ArrayParaules[i] = input.nextLine();
        }
        System.out.println("Les paraules son: " + Arrays.toString(ArrayParaules));

        System.out.println("Quina paraula es la mes llarga? Primer hem de saber la longitud de totes ");

        for (int i = 0; i < ArrayParaules.length; i++) {
            System.out.println("La longitud de la paraula: " + (i + 1) + " es: " + ArrayParaules[i].length());
        }

        for (int i = 0; i < ArrayParaules.length; i++) {

        }

    }
}
