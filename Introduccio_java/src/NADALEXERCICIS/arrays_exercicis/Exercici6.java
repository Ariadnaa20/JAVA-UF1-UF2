package NADALEXERCICIS.arrays_exercicis;

import java.util.Scanner;

public class Exercici6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean sortir= false;
        int posicio_destijada;
        int posicio_eliminar=0;
        int opcio;

        int ultimoNumero;

        int[] numeros= new int[10];


        // inicialitzem amb valors donats de l'usuari

        for(int i=0; i< numeros.length; i++){
            System.out.println("Siusplau, introdueix el nombre " + (i+1) + " : ");
            numeros[i]=input.nextInt();
        }

        // Imprimim

        for (int elemento: numeros){
            System.out.println("Els numeros son " + elemento);
        }


        // imprimim posicio destijada de l'usuari


            do{

                System.out.println("Escull una opcio si vols imprimir una posicio(1) o  eliminar posicio? (2)");
                opcio=input.nextInt();

                switch(opcio){

                    case 1:
                        System.out.print("Quina posició desitjes imprimir ? ");
                        posicio_destijada=input.nextInt();


                        if(posicio_destijada>=0 && posicio_destijada < numeros.length){
                            int numeroPosicion= numeros[posicio_destijada];  // esto no lo entiendo,
                            System.out.println("El número en la posición " + posicio_destijada + " es: " + numeroPosicion);
                            sortir=true;


                        } else {
                            System.out.println("Posicio invalida. ");
                        }
                    break;

                    case 2:
                        System.out.println("Introdueix quina posicio vols eliminar?");
                        posicio_eliminar=input.nextInt();

                        if(posicio_eliminar>=-1 && posicio_eliminar<numeros.length -1){
                            for(int i= posicio_eliminar; i<numeros.length - 1; i++){
                                numeros[i]=numeros[i + 1];
                            }
                        }

                        numeros[numeros.length-1]=-1;

                        for (int i=0; i<numeros.length; i ++){
                            System.out.print(numeros[i]);
                        }

                        sortir=true;
                        break;

                    default:
                        System.out.println("Posicio invalida torna a introduir una opció");


                }


            } while (!sortir);


            /*En la línea int numeroPosicion = numeros[posicio_destijada];,
            se está accediendo al elemento en la posición posicio_destijada dentro del array numeros y
            asignando ese valor a la variable numeroPosicion.*/


           /*numeros[posicio_destijada] accede al elemento en la posición posicio_destijada del array numeros.*/


    }
}
