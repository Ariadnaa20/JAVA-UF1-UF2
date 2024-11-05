package UF5;

import java.util.ArrayList;
import java.util.Scanner;

public class MitjanaQualificacions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notes = new ArrayList<>(); // Creem una ArrayList per emmagatzemar les notes

        while (true) {
            System.out.print("Introduïu la nota de l'alumne (0-10) o -1 per acabar: ");
            double nota = scanner.nextDouble();
            //he posat -1 per dir q el ususari pari

            // Comprovació si l'usuari vol acabar
            if (nota == -1) {
                break;
            }

            // validem q la nota estigui entre 0 i 10
            if (nota >= 0 && nota <= 10) {
                notes.add(nota); // Afegim la nota a la llista
            } else {
                System.out.println("Nota no vàlida. Si us plau, introduïu una nota entre 0 i 10.");
            }
        }

        // for per agafar notes
        if (!notes.isEmpty()) {
            double suma = 0;
            for (int i = 0; i < notes.size(); i++) {
                suma += notes.get(i); // Sumar cada nota
            }
            double mitjana = suma / notes.size(); // fas la divisio

            System.out.println("La mitjana de les qualificacions és: " + mitjana);
        } else {
            System.out.println("No s'ha introduït cap nota vàlida, per tant no es pot calcular la mitjana.");
        }

        scanner.close(); // Tanquem el scanner
    }
}
