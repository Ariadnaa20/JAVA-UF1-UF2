package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici12Pseudo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double litres=0;
        double litres50200=0.15;
        double cuotafixa=6;
        int opció=0;
        double litres200=0.30;
        double costLitres=0;


        System.out.println("Benvingut,calcula el teu consum d'aigua ");
        System.out.println("Introdueix un 1 si gastas menys de 50l, " +
                "introdueix un 2 si el teu consum l'aigua esta entre 50 i 200l i, "+
                "introdueix un 3 si el teu consum supera el 200l");

        opció=scanner.nextInt();


        switch (opció){
            case 1:
                System.out.println("introdueix la quantitat de litres exacta");
                litres=scanner.nextInt();
                scanner.nextLine();
                if (litres<50){
                    System.out.println("No tens quota variable perque consumeixes" + litres + "litres");
                }
            case 2:
                System.out.println("Introdeix la quantitat de litres exacta");
                litres=scanner.nextInt();
                scanner.nextLine();
                if (litres>50 && litres<=200){
                    costLitres=(litres*litres50200)+cuotafixa;
                    System.out.println("El cost es" + costLitres + "euros");
                }
            case 3:
                System.out.println("Introdueix la quantitat de litres exacta");
                litres=scanner.nextInt();
                scanner.nextLine();
                if (litres>200){
                    costLitres=(litres*litres200)+cuotafixa;
                    System.out.println("El cost es" + costLitres + "euros");
                }
                scanner.close();
        }
    }
}
