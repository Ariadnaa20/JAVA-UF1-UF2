package NADALEXERCICIS;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean VIP=false;
        int compra=0;

        System.out.println("benvingut, podras obtenir el teu descompte?");
        System.out.println("Siusplau contesta si o no a aquestes preguntes:");

        System.out.println("Ets client vip? Si ho ets introdueix: true. si no ho ets introdueix false");
        VIP=input.nextBoolean();


        System.out.println("Introdueix el valor de la teva compra");
        compra=input.nextInt();

        if(VIP || compra>=200){
            System.out.println("Pots obtenir descompte!!");
        } else{
            System.out.println("Ho sento no pots obtenir descompte");
        }




    }
}

// ENS HA COSTAT EL TEMA DEL BOOLEANS. enrecordat que l'usuari ha d'instrudir true o false per a que ña maquina ho reconeixi