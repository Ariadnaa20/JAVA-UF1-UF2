package STRINGS;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcio;

        System.out.println("Digues quina d'aquestes variables no es un tipus primitiu en JAVA");
        System.out.println( "a. int");
        System.out.println( "b. char");
        System.out.println( "c. boolean");
        System.out.println( "d. String");

        opcio = input.nextLine().toLowerCase(); // per a que no es tinguin en compte les mayuscules i minusucules



        switch(opcio){
           case "a":
               System.out.println("Resposta incorrecta");
               break;


            case "b":
                System.out.println("Resposta incorrecta");

                break;

            case "c":
                System.out.println("Resposta incorreta");
                break;


            case "d":
                System.out.println("Resposta correcta");
                break;

            default:
                System.out.println("La resposta correta es la d. :)");



        }
    }
}
