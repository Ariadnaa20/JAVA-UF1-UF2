package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici6Pseudo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //variables
        int opció;
        int plou=0;
        int plou_Molt=0;
        int status_comporta=0;




        System.out.println("Benvingut al programa de gestionar comportes. INSTRUCCIONS:");

        System.out.println("Si vols iniciar vigilancia, introdueix un 1. Per el contrari si vols sortir, introdueix un 2");
        System.out.println("En el cas que hagis indicat iniciar vigilancia, indica si plou amb un 1 o si no plou amb un 0");
        System.out.println("Siusplau, tambe has d'indicar si la comporta es oberta 1 o la comporta es tancada 0. ");

        System.out.println("Siusplau, selecciona una opció, es a dir, inicies vigilancia?:");


        opció=scanner.nextInt();

        switch (opció){ //es un menú. Podemos escojer diferentes opciones opcion 1 i opcion 2
            case 1:
                System.out.println("Esta plovent? Posa 0 si es NO o posa 1 si es SI");
                plou=scanner.nextInt();
                System.out.println("D'acord, opció llegida");

                System.out.println("Esta plovent molt? Posa 0 si es NO o posa 1 si es SI");
                plou_Molt=scanner.nextInt();
                System.out.println("D'acord, opció llegida");

                while (plou==1){
                    System.out.println("La comporta esta oberta?");
                    status_comporta= scanner.nextInt();

                    if (status_comporta==0 ){ //com poso. Que les comportes s'obrin si plou i plou molt. pero en el caso que no acabaria el codi
                        System.out.println("Obrint comportes");
                        status_comporta=1;
                        System.out.println("Opció llegida. Comportes obertes");
                    } else {
                        System.out.println("Keep calm, ja esta oberta");
                    }

                    System.out.println("Està plovent? Posa 0 si es NO, posa 1 si es SI:"); //esto hace que nunca salgas del bucle mientras la condicion incical se cumpla
                    plou = scanner.nextInt();

                }
                break;

            case 2:
                System.out.println("Sortim.");
                break;
            default:
                System.out.println("Opció no valida");


        } scanner.close();


    }
}
