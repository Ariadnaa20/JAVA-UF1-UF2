package NADALEXERCICIS.arrays_exercicis2;

import java.util.Scanner;

public class ArrayEncuentraElMayor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int numeroGran;

        int[] numeros= new int[5];

        for(int i=0; i< numeros.length; i++){
            System.out.print("Siusplau, introdueix el nombre " + (i+1) + " : ");
            numeros[i]=input.nextInt();
        }

        for(int elemento: numeros){
            System.out.println("L'element es: " + elemento);
        }

        // Quin es el mes gran?


        for(int i= 0; i<numeros.length -1; i++){
            for(int j= i+1; j<numeros.length; j++){
                if(numeros[i]> numeros[j]){  // descendiente seria el simbolo <
                    int cambio= numeros[i];
                    numeros[i]=numeros[j];
                     numeros[j]=cambio;
                }
            }

        }

        numeroGran= numeros[numeros.length-1];
        System.out.println("El numero mes gran es: " + numeroGran);

        for(int elemento: numeros){
            System.out.println("El array ordenat es: " + elemento);
        }
    }
}
