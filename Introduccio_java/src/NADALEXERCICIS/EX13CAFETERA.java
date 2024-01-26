package NADALEXERCICIS;

import java.util.Scanner;

public class EX13CAFETERA {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean sortir=false;
        int opcio;
        double moneda=0.00;
        double canvi=0.00;
        double preciominimo=0.50;


        System.out.println("Hola, encantat de que estiguis aquí de nou. ");


        do{
            System.out.println("Quin producte vols? 1.Café  2.Tallat  3.Cafè amb llet 4.Sortir");
            opcio=input.nextInt();

            switch(opcio){

                case 1:
                    System.out.println("Perfecte, has seleccionat cafè");
                    System.out.println("Siusplau, introdueix una moneda superior a 0,50 euros");
                    moneda=input.nextDouble();
                    input.nextLine();

                    if (moneda>=preciominimo){
                        System.out.println("preparant el café...");
                        canvi=moneda-preciominimo;
                        System.out.println("el canvi es: " + canvi);

                    } else{
                        System.out.println("error...");
                    }

                    break;




                case 2:
                    System.out.println("Perfecte, has seleccionat tallat");
                    System.out.println("sisuplau, introdueix una moneda");
                    moneda=input.nextDouble();
                    input.nextLine();

                    if (moneda>=preciominimo){
                        System.out.println("preparant el tallat...");
                        canvi=moneda-preciominimo;
                        System.out.println("el canvi es: " + canvi);

                    } else{
                        System.out.println("error...");
                    }


                    break;


                case 3:

                    System.out.println("Perfecte has seleccionat cafè amb llet");
                    System.out.println("siusplau, introdueix una moneda");
                    moneda=input.nextDouble();
                    input.nextLine();

                    if (moneda>=preciominimo){
                        System.out.println("preparant el tallat...");
                        canvi=moneda-preciominimo;
                        System.out.println("el canvi es: " + canvi);

                    } else{
                        System.out.println("error...");
                    }


                    break;

                case 4:

                    System.out.println("Que vagi molt be, espero que tornis....");
                    sortir=true;

                default:
                    System.out.println("Opció no valida");
            }




        } while(! sortir);
    }
}

// QUE ES EL QUE M'HA COSTAT?

/*
1. SWITCH NO T'ENRECORDAVES DE POSAR EL PARAMETRE OPCIÓ I EL BREAK DELS CASOS
2. LOS DOUBLE NO TE LOS COJE. PON SIEMPRE EL INPUT.NEXTLINE PARA QUE NO TE PASE ESO
3. INPUT. CLOSE NO LO HAS PUESTO NI EL INPUT.NEXTLINE
4. LA ESTRUCTURA DE LOS IF

*/
