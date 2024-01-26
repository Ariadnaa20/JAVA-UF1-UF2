package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici4Pseudo {
    public static void main(String[] args) {

        double nois= 0;
        double noies=0;
        double total_Alumnes=0;
        double percentatge_Nois=0;
        double percentatge_Noies=0;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Benvingut al programa per saber el percentatge de nois i noies a la clase");

        // suma de nois i noies a l'aula

        System.out.println("Siusplau, introdueix la quantitat de nois que hi ha a la clase");
        nois=scanner.nextInt();

        System.out.println("Gràcies company. Seguidament introdueix la quantitat de noies a la clase");
        noies=scanner.nextInt();

        System.out.println("Gracies guapi, quantitat llegida.");
        total_Alumnes=nois+noies;
        System.out.println("El total d'alumnes a clase es de:" + total_Alumnes);

        //percentatges nois i noies

        System.out.println("Dos segons que calculo el percentatge dels nois i noies:");
        percentatge_Nois=(nois/total_Alumnes)*100;
        System.out.println("El percentatge de nois es:" + percentatge_Nois);

        percentatge_Noies=(noies/total_Alumnes)*100;
        System.out.println("El percentatge de noies es:" + percentatge_Noies);

        System.out.println("Que vagi be company");

        scanner.close();;





    }
}
