package STRINGS_EXAPART;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Introdueix una frase");
        String frase= input.nextLine();
        int contador=0;

        String[] parts= frase.split(" ");  //metode split convertir la frase en un array per separar paraules
        System.out.println(Arrays.asList(parts));



        for (int i = 0; i < parts.length; i++) {
            for (int j = i + 1; j < parts.length; j++) {
                if (parts[i].equalsIgnoreCase(parts[j])) {
                    contador++;
                    break; // Salir del bucle interno una vez que se encuentra una coincidencia
                }
            }
        }

        System.out.println("Les paraules repetides: " + contador);
    }}


