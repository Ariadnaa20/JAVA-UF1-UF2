package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class EXERICIEXAMEN4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcion;
        double diners;
        boolean sortir = false;
        double precioBitcoin = 32296.53;
        double precioEthereum = 1693.80;


        do {
            System.out.println("Quin producte vol?\n1. Comprar Bitcoins\n2. Comprar Ethereum\n3. Sortir de la aplicació");
            opcion = input.nextInt();
            input.nextLine(); // Consumir la nueva línea pendent

            switch (opcion) {
                case 1:
                    System.out.println("Perfecte, has decidido comprar Bitcoins. Introdueix els euros per obtenir l'equivalent.");

                    do {
                        diners = input.nextDouble();
                        input.nextLine(); // Consumir la nueva línea pendiente

                        if (diners < 1 || diners > 1000) {
                            System.out.println("Import fora de rang. El valor ha d'estar entre 1€ i 1000€. Introdueix de nou:");
                        }
                    } while (diners < 1 || diners > 1000);

                    double equivalenteBitcoins = diners / precioBitcoin;
                    System.out.println("L'equivalent en bitcoins és: " + equivalenteBitcoins);
                    break;

                case 2:
                    System.out.println("Perfecte, has decidido comprar Ethereum. Introdueix els euros per obtenir l'equivalent.");

                    do {
                        diners = input.nextDouble();
                        input.nextLine(); // Consumir la nueva línea pendiente

                        if (diners < 1 || diners > 1000) {
                            System.out.println("Import fora de rang. El valor ha d'estar entre 1€ i 1000€. Introdueix de nou:");
                        } else{
                            double equivalenteEthereum = diners / precioEthereum;
                            System.out.println("L'equivalent en Ethereum és: " + equivalenteEthereum);
                        }


                    } while (diners < 1 || diners > 1000);


                    break;

                case 3:
                    System.out.println("Sortint del programa.");
                    sortir = true;
                    break;

                default:
                    System.out.println("Opció no vàlida. Torni a introduir una opció.");
                    break;
            }
        } while (!sortir);
        System.out.println("Gracies per utlitzar el teu contador preferit");

        input.close();
    }
}

