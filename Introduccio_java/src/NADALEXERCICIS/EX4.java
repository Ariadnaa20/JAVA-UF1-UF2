package NADALEXERCICIS;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int total=0;
        int nois=0;
        int noies=0;
        int percentatgeNois;
        int percentatgeNoies;




        System.out.println("Benvingut quin es el % de nois/noies a la teva clase?");
        System.out.println("Digues quants sou en total a clase");
        total=input.nextInt();

        System.out.println("Digues quants nois sou en total");
        nois=input.nextInt();

        System.out.println("Digues quantes noies sou en total");
        noies=input.nextInt();




        int totalnoisinoies= nois + noies;


        if (totalnoisinoies>total || totalnoisinoies<total){
            System.out.println("error posa ve els numeros que no et cuadra");
        } else{
            percentatgeNois= (nois*100)/total;
            System.out.println("El percentage de nois es: " + percentatgeNois + "%");

            percentatgeNoies=(noies*100)/total;
            System.out.println("El percentage de noies es: " + percentatgeNoies + "%");

        }
        // formula

        /* total - 100%
         *  nois  -  x? */



    }
}
