package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici10Pseudo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double preuCrypto=8400.0;
        boolean mercat_Alça=true;
        int inversió=0;
        double beneficis=0;
        double oscilació=0.02;
        double importTotalBitcoins=0;
        double importTotalBeneficis=0;


        System.out.println("Calcula el teu benefici invertint ");
        System.out.println("Sisplau, introdueix la cantitat que desitjis per invertir");
        inversió=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Siusplau, introdueix si el mercat es al alça o a la baixa T/F");
        mercat_Alça=scanner.hasNext();
        scanner.nextLine();

        if(mercat_Alça==true){
            beneficis=inversió*oscilació;
        } else{
            beneficis=-inversió*oscilació;
        }
        importTotalBitcoins=inversió/preuCrypto;
        importTotalBeneficis=importTotalBitcoins+beneficis;

        System.out.println("Despres de l'inversió tindrás" + importTotalBeneficis + "beneficis.");

        scanner.close();





    }
}
