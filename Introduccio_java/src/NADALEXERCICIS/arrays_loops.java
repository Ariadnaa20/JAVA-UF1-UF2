package NADALEXERCICIS;

import java.util.Scanner;

public class arrays_loops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // INPUT : INTRODUEIM VALORS DIRECTAMENT DINS DE LA ARRAY
        System.out.println("INTRODUIM VALORS DINS DE LA ARRAY= INPUT");
        int numero;
        int[] numeros= new int[4];

        for (int i=0; i<numeros.length; i++){
            System.out.println("Introdueix un numero");
            numero=input.nextInt();
            numeros[i]=numero; // actualitza la classificació del array MOLT IMPORTANT
        }


        // MANERA EXPLICADA A CLASSE PER IMPRIMIR
        for (int i=0; i<numeros.length; i++){
            System.out.print("Posició: " + i + " Numero corresponent " + numeros[i]); // no hem posat el ln
        }

        // FOR EACH PER IMPRIMIR
        System.out.println("IMPRIMIT AMB FOR EACH");
        for(int element: numeros){
            System.out.println("Numero: " + element); //ln es salto de linea
        }
    }

}
