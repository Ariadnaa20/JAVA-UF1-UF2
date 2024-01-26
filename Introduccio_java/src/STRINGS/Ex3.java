package STRINGS;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Introdueix un text: ");
        String text = input.nextLine();

        String text_mayus = text.toUpperCase();  // fa que el text estigui en mayuscules
        System.out.println("El text en mayuscules es: " + text_mayus);

        String text_minus = text.toLowerCase();  // fa que el text estigui en minúsucules
        System.out.println("El text en minuscules es: " + text_minus);


    }
}


