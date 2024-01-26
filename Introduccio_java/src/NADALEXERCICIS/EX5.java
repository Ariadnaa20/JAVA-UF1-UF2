package NADALEXERCICIS;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double VGC= 73.490d;
        double VFE= 93.490d;
        double kilometres=0.00d;
        int opcio;
        double devaluacio;


        System.out.println("Benvingut calcula el valor de mercat per si vols vendre la teva california.");
        System.out.println("De quina  Volkswagen vols calcular?");
        System.out.println("Si es la Volkswagen Grand California introdueix 1 i es la Full Equip doncs 2");

        opcio=input.nextInt();
        input.nextLine();

        switch (opcio){


            case 1:
                System.out.println("Introdueix els kilometres");
                kilometres=input.nextDouble();
                input.nextLine();

                devaluacio = kilometres*0.00001;
                System.out.println("La pots vendre per: " + (VGC-devaluacio) + "euros");
                break;

            case 2:
                System.out.println("Introdueix els kilometres");
                kilometres=input.nextDouble();
                input.nextLine();

                devaluacio = kilometres*0.00001;
                System.out.println("La pots vendre per: " + (VFE-devaluacio) + " euros");
                break;



            default:
                System.out.println("Opció no valida");


        } input.close();





    }
}
