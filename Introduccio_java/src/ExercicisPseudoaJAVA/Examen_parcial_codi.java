package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Examen_parcial_codi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);  //declarem el Scanner per a que l'usuari interactui.
        //VARIBALES
        /* les variables serán utilitzades al llarg del codi.
        * Es important inicialitzarles amb els seus corresponents valors:   */

        int opcio=0;
        double diners=0.00d;
        boolean sortir=false;
        double precioBitcoin = 32296.53;
        double precioEthereum=1693.80;

        do{
            System.out.println("Quin producte vol?\n1. Comprar bitcoins\n2. Comprar Ethereum\n3. Sortir de la aplicacció");
            opcio = input.nextInt();


            switch(opcio){

                case 1:
                    System.out.println("Perfecte, has decidIT comprar Bitcoins. Introdueix els euros per obtenir l'equivalent.");

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
                        }
                    } while (diners < 1 || diners > 1000);

                    double equivalenteEthereum = diners / precioEthereum;
                    System.out.println("L'equivalent en Ethereum és: " + equivalenteEthereum);
                    break;





                case 3:
                    System.out.println("Sortint del programa.");
                    sortir = true;
                    break;

                default:
                    System.out.println("Opció no vàlida. Torni a introduir una opció.");
                    break;




            } input.close();



        }while (!sortir);
















    }
}




/*CODIGO:
        - Comentarios i decir por ejemplo // DECLAREM VARAIBLES, //DECLAREM SCANNER. //aqui calculo...
        - variable float i double (f, d) al final
        - variable=input.nextLine
        - Les variables double i float recorda posar una d i una f al final
        - scanner.close();
        - break SWITCH i continue FOR*/






