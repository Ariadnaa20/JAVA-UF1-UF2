package NADALEXERCICIS;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // ARRAY ESTATICA


        int [] mi_array= new int[5]; // declarem i posem valors:
        mi_array[0]=5;
        mi_array[1]=10;
        mi_array[2]=15;
        mi_array[3]=20;
        mi_array[4]=30;


        // esta forma no es correcta d'imprimir

        System.out.println(mi_array[0]);
        System.out.println(mi_array[1]);
        System.out.println(mi_array[2]);
        System.out.println(mi_array[3]);
        System.out.println(mi_array[4]);

        // esta forma si que es correcta d'imprimir

        for(int i=0; i< mi_array.length; i++){
            System.out.println("Valor del indice : " + i + " con el valor de: "+ mi_array[i]);
        }



        // ARRAY DINAMICA

        int[] mi_arrayE= {5,10,15,20,30};

        for(int i=0; i< mi_array.length; i++){
            System.out.println("Valor del indice : " + i + " con el valor de: "+ mi_arrayE[i]);
            System.out.println("La longitud de mi array: " + mi_arrayE.length); // Es el valor total no el index
        }


        //SORTING

        System.out.println("SORTING");

        int[] arraySort= {15,5,2,9,14,13};

        for(int i=0; i<arraySort.length -1; i++){
            for(int j=i+1; j<arraySort.length; j++){
                if(arraySort[i]>arraySort[j]){
                    int cambio= arraySort[i];
                    arraySort[i]=arraySort[j];
                    arraySort[j]=cambio;
                }
            }
        }

        //IMPRIMIR CON FOR

        for(int i=0; i<arraySort.length; i++){
            System.out.println(arraySort[i]);
        }

        // IMPRIMIR CON BUCLE FOR EACH
        System.out.println("BUCLE FOR EACH");

        for(int elemento:arraySort){
            System.out.println("Número: " + elemento);

        }




    }
}
