package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exerici13correcioprofe {
    public static void main(String[] args) {

        //VARIABLES
        Scanner input = new Scanner(System.in);
        int opcio=0;
        double diners=0.00d;
        boolean sortir=false;

        do {
            System.out.println("Quin producte vol?\n1. Cafè\n2. Tallat\n3. Cafè amb llet\n4. Sortir");
            opcio = input.nextInt();

            switch (opcio) {
                case 1:
                    System.out.println("Introdueixi una moneda (0.5€ requerits): ");
                    diners = input.nextDouble();
                    input.nextLine();

                    if (diners <= 0.50) {
                        System.out.println("Preparant el Cafè...");
                        diners = diners - 0.50;
                        System.out.println("Cafè entregat. Canvi: " + diners + "€");
                    } else {
                        System.out.println("Import insuficient. ");
                        sortir=true;
                    }
                break;

                case 2:
                    System.out.println("Introdueixi una moneda (0.5€ requerits): ");
                    diners = input.nextDouble();
                    input.nextLine();

                    if (diners >= 0.50) {
                        System.out.println("Preparant el Tallat...");
                        diners = diners - 0.50;
                        System.out.println("Tallat entregat. Canvi: " + diners + "€");
                    } else {
                        System.out.println("Import insuficient.");
                        sortir=true;
                    }
                break;

                case 3:
                    System.out.println("Introdueixi una moneda (0.5€ requerits): ");
                    diners = input.nextDouble();
                    input.nextLine();

                    if (diners >= 0.50) {
                        System.out.println("Preparant el Cafè amb llet...");
                        diners = diners - 0.50;
                        System.out.println("Cafè amb llet entregat. Canvi: " + diners + "€");
                    } else {
                        System.out.println("Import insuficient.");
                        sortir=true;
                    }
                break;

                case 4:
                    System.out.println("Sortint del programa.");

                break;

                default:
                    System.out.println("Opció no vàlida. Torni a introduir una opció.");

                break;
            }
        } while (opcio !=4 && !sortir);
        System.out.println("Gràcies per utilitzar la màquina de cafè. Fins aviat!");
        input.close();



    }

}
