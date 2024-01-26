package NADALEXERCICIS.arrays_exercicis;

import java.util.Scanner;

public class Exercici3 {  // super important
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);



        int[] numeros= new int[5];
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contador_Ceros = 0;

        System.out.println("Introdueix 5 nombres: ");

        for(int i=0; i<numeros.length; i++){

            numeros[i]=input.nextInt();  // leemos i almacenamos


            if(numeros[i]>0){  // es mejor poner siempre numeros[i]
                sumaPositivos += numeros[i]; // esta mal =+ : el operador de acumulacion i suma  es +=
                contadorPositivos++; // sirve para asegurarnos que el numero alamcenado sea indice 0, 1, 2..
                /* sumaPositivos+= numeros[i];= acumulamos los numeros i los sumamos . SumaPositivos seria como una caja i los suma
                * si quisieramos acumular solo numeros sin sumarlos tendriamos que utlizar otra array. Exercici 3.1*/



            } else if(numeros[i]<0){
                sumaNegativos+= numeros[i];
                contadorNegativos++;  // total de numeros


            } else{
                contador_Ceros++;  // esto es solo para contar cuantos ceros es decir el total

            }



        }

        System.out.println("la suma de numeros positivos es: " + sumaPositivos);
        System.out.println(sumaNegativos);

        int media= sumaPositivos/contadorPositivos;
        System.out.println("La media de positivos es: " + media);




        System.out.println("la suma de numeros negativos es: " + sumaNegativos);


        int media2= sumaNegativos/contadorNegativos;
        System.out.println("La media de negativos es: " + media2);

















        /*Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los números negativos y
          contar el número de ceros.*/











    }
}
