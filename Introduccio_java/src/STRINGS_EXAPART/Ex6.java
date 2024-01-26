package STRINGS_EXAPART;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introdueix una frase : ");
        String frase1= input.nextLine();

        System.out.println("Introdueix una frase ");
        String frase2 = input.nextLine();

        if(frase1.equalsIgnoreCase(frase2)){
            System.out.println("Les frases son iguals");

        }else {
            System.out.println("Amor les frases no son iguals");
        }
    }
}
