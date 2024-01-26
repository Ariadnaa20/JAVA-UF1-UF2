package NADALEXERCICIS;

import java.util.Scanner;

public class EX_ORD_UF1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int opcio;
        boolean sortir=false;
        String escola="";

        System.out.println("Benvingut, al centre d'informació COVID de Gràcia");
        System.out.println("Quines dades vols conèixer?");
        System.out.println("\n1. Mostrar totes les dades\n2. Total de persones confinades\n3. Escola amb menys casos entre alumnes i professors\n4. Mostrar totes les dades filtrades per escola\n5. Sortir");
        opcio=input.nextInt();


        switch(opcio){
            case 1:
                System.out.println("Mostra de forma ordenada les dades de totes les escoles");
                System.out.println("         ESCOLA        GRUPS CONFINATS      ALUMNES POS      DOCENTS POS");
                System.out.println("La salle Gràcia                      1               29                1");
                System.out.println("  Rius i Taulet                      5              114                5");
                System.out.println(" Verduna Gràcia                      1               19                0");
                System.out.println("Turó del Cargol                      0                0                1");
                System.out.println("  Reina Violant                      1               33                8");
                break;


            case 2:
                System.out.println("Calcular i mostrar el total de persones amb COVID");
                System.out.println("El total de persones confinades es: ");

                break;



            case 3:
                System.out.println("Calcular i mostrar l'escola amb menys casos COVID");

                break;




            case 4:
                System.out.println("opció de cerca per mostrar totes les dades de les escoles que el seu nom coincideixi amb una cadena proporcionada per l’usuari.");
                escola=input.nextLine();
                break;



            case 5:
                System.out.println("Sortint de l'aplicació...");
                sortir=true;
        }


    }
}
