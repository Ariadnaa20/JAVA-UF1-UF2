package NADALEXERCICIS;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        boolean sortir=false;
        int opcio=0;
        boolean comportes=false;
        int plou=0;
        int iniciarVigilància;
        boolean estaSegur;

        do{

            System.out.println("Benvingut, no posem en perill la ciutat de girona.");
            System.out.println("siusplau digues si 1 si plou bastant o 2 no plou gaire 3. tancar vigilancia. 4. Sortir ");
            opcio=input.nextInt();

            switch(opcio){

                case 1:
                    System.out.println("Has seleccionat que plou, introdueix un 1 si plou + de 90l o un 0 si no. ");
                    plou=input.nextInt();

                    if(plou==1){
                        System.out.println("Obrim comportes");

                    } else {
                        System.out.println("no plou gaire pero que et sembla si iniciem vigilància. Digues 1 si vols o 0 si no vols");
                        iniciarVigilància=input.nextInt();

                        System.out.println("Perfecte, opció realitzada amb èxit. VIGILANCIA ACTIVADA");

                    }

                    break;

                case 2:
                    System.out.println("No cal obrir comportes");
                    System.out.println("Estas segur que no vols obrir comportes repon true si vols obrir o false si no?");
                    estaSegur=input.nextBoolean();

                    if(estaSegur){
                        System.out.println("Doncs obrim comportes");
                    } else{
                        System.out.println("no obrim comportes");
                    }

                    break;

                case 3:
                    System.out.println("Tanquem vigilància d'acord?");
                    estaSegur=false;
                    System.out.println("Vigilància tancada :)");


                case 4:
                    System.out.println("Sortint del programa...");
                    sortir=true;



                    default:  // NO EM DEIXA. MIRAHO
                    System.out.println("opció no valida");

            }

        } while(!sortir);

    }
}
