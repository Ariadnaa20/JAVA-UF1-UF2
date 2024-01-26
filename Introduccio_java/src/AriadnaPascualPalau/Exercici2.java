package AriadnaPascualPalau;

import java.util.Scanner;

public class Exercici2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] paraules = new String[7];
            StringBuilder paraulaDesencriptada = new StringBuilder();
            System.out.println("benvingut, siusplau, segueix les seguents indicacions. ");

            // Demanar a l'usuari que introdueixi 7 paraules.
            System.out.println("Introdueix 7 paraules:");
            for (int i = 0; i < 7; i++) {
                System.out.print("Paraula " + (i + 1) + ": ");
                paraules[i] = scanner.next();

                // Agafar la segona lletra de cada paraula llavors comprovem.
                if (paraules[i].length() >= 2) {  //aquesta es la condició comprova la longitut de la paraula
                    paraulaDesencriptada.append(paraules[i].charAt(1));
                } else {
                    System.out.println("La paraula introduïda és massa curta. Utilitzant el primer caràcter en lloc de segon.");
                    paraulaDesencriptada.append(paraules[i].charAt(0));
                }
            }

            // la paraula desencriptada es:
            System.out.println("La paraula encriptada es: " + paraulaDesencriptada);

            scanner.close();
        }

}