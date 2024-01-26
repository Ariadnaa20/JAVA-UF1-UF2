package STRINGS;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Introdueix un text");
        String text = input.nextLine();

        if(text.isEmpty()){ // comprovar si esta buit
            System.out.println("no has introduit res tonto");
            return;  //per sortir del programa
        }


        System.out.println("Introdeuix una paraula per buscar ");
        String paraula = input.nextLine();

        if(text.contains(paraula)){  // comprovar si contè la paraula
            System.out.println("Paraula trobada: " + paraula);
            System.out.println("La paraula es: " + paraula + " Es troba la frase: " + text);
        } else{
            System.out.println("Paraula no trobada");
        }




    }
}

