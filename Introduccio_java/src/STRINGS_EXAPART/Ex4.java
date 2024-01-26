package STRINGS_EXAPART;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Introdueix una frase");
        String frase= input.nextLine();

        String[] ArrayFrase= frase.split(" ");



        System.out.println("Introdueix una paraula a buscar a la frase");
        String paraulaBuscar= input.nextLine();

        System.out.println("Introdueix una paraula per cambiarla");
        String paraulaCanviar= input.nextLine();

        for(int i =0; i< ArrayFrase.length; i++){  // en los bucles se juega con indices no strings
            if(ArrayFrase[i].equalsIgnoreCase(paraulaBuscar)){ //no puedo poner un ArrayFrase[ParaulaBuscar] ni un operador igual tampoco
                ArrayFrase[i]=paraulaCanviar;
            }
        }

        System.out.println("La nova frase es : " + Arrays.toString(ArrayFrase));


    }
}
