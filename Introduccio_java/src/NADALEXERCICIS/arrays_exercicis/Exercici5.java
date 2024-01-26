package NADALEXERCICIS.arrays_exercicis;

import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] numeros= new int[10];

        for(int i=0; i< numeros.length; i++){
            System.out.println("Numero " + (i+1) + " : " );
            numeros[i]= input.nextInt();
        }

        for (int i=0; i< numeros.length; i++){
            System.out.println(numeros[i]);
        }

        // DESPLAÇAMENT A LA DRETA SEMPRE ES COMENÇA DESDE EL FINAL
        int UltimoElemento=numeros[numeros.length - 1];  //guardem l'ultim element

        // desplaçament a la dreta
        for(int i= numeros.length-1; i>0; i--){
            numeros[i]= numeros[i-1];
        }

        numeros[0]= UltimoElemento;  // assignem l'ultim element a la posicio 0

        System.out.println("Els nombres despres del desplaçament son: ");

        for (int i=0; i< numeros.length; i++){
            System.out.print(numeros[i]);
        }




    }

    //porque es -1? porque numeros.lengh es 10 pero l'index va del 0-9. llavors li restem 1 al 10 per referirnos
    // al numero 10 en el index 9.
    // enrecordat que el lenght es es el total de elements no el total de index dins del cortxete va el index
}
