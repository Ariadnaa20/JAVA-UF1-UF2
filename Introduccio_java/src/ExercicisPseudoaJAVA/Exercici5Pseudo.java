package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici5Pseudo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double volkswagen_California= 73490.0;
        boolean volksCali=true;
        double volkswagen_Fullequip= 93490.0;
        double depreciació= 0.00001;
        double preuFinal=0;
        int kilometros=0;



        System.out.println("Si es la california, introdueix TRUE, si es la Fullequip, introdueix FALSE");
        volksCali=scanner.nextBoolean();

        System.out.println("Porfabor, introduce los kilometros recorridos:");
        kilometros=scanner.nextInt();


        if(volksCali){
            preuFinal=volkswagen_California * (depreciació/100) *kilometros;
            scanner.nextLine();
            System.out.println("El preu final de la volkswagen California es:" + preuFinal);
        } else{
            preuFinal=volkswagen_Fullequip* (depreciació/100) *kilometros;
            scanner.nextLine();
            System.out.println("El preu final de la volkswagen Camper Full Equip es:" + preuFinal);
        }

        System.out.println("Gracies company");
        scanner.close();


    }
}
