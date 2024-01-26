package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici8Pseudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcio = 0;
        int dies = 0;
        int costtotalestancia = 0;
        int vatard = 0;
        int diesmitjapensio = 0;

        System.out.println("Benvingut al programa de facturació");
        System.out.println("Posa 1, si vols calcular  el valor de l´estancia ");
        System.out.println("Posa 2, si vols calcular l´estancia amb cost adicional per sortir tard");
        System.out.println("Posa 3. si vols calcular, estancia amb mitja pensió.");
        System.out.println("Posa 4, si vols sortir");
        Scanner llegiropcio = new Scanner(System.in);
        opcio = llegiropcio.nextInt();

        switch (opcio) {
            case 1:
                System.out.println("Estic a la opció1");
                //AQUI CALCULO EL VALOR DE L´ESTANCIA SENSE COST ADICIONAL NI MITJA PENSIÓ
                System.out.println("Introdueix els número de dies que es queda el client");
                dies = llegiropcio.nextInt();
                costtotalestancia = dies * 20;
                System.out.println("El import a cobrar es " + costtotalestancia + "€");
                break;
            case 2:
                //AQUI CALCULO ESTANCIA AMB COST ADICIONAL
                System.out.println("Introdueix els número de dies que es queda el client");
                dies = llegiropcio.nextInt();
                System.out.println("Aquest client ha sortit tard, posa 1, si es que si, posa 2, si es que no");
                vatard = llegiropcio.nextInt();
                if (vatard == 1) {
                    costtotalestancia = dies * 20;
                    costtotalestancia = costtotalestancia + 15;
                    System.out.println("El import a cobrar es " + costtotalestancia + "€");
                } else if (vatard == 2) {
                    costtotalestancia = dies * 20;
                    System.out.println("El import a cobrar es " + costtotalestancia + "€");
                } else {
                    System.out.println("No es cap de les dues opcions que t´he demanat. Adeu");
                }

                break;
            case 3:
                //AQUI CALCULO ESTANCIA, AMB MITJA OPCIÓ
                System.out.println("Introdueix els número de dies que es queda el client");
                dies = llegiropcio.nextInt();
                System.out.println("Introdueix els número de dies que vol de mitja pensió");
                diesmitjapensio = llegiropcio.nextInt();
                costtotalestancia = dies * 20;
                if ((dies >= diesmitjapensio) && !(diesmitjapensio < 0)) {
                    costtotalestancia = costtotalestancia + (diesmitjapensio * 20);
                    System.out.println("El import a cobrar es " + costtotalestancia + "€");
                } else if (diesmitjapensio == 0) {
                    System.out.println("Perque entres a la opció 2??");
                } else {
                    System.out.println("Has introduit un numero incorrecte de dies");
                }


                break;
            case 4:
                //VOL SORTIR DEL PROGRAMA
                System.out.println("Estic a la opció3 ");
                break;
            default:
                //NO SAP QUE VOL.
                System.out.println("No se que fer amb la meva vida");
                break;




        }
    }

}
