package STRINGS_EXAPART;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean paraulaTrobada= false;
        String[] palabras={
                "Hola", "Que tal", "todo bien?"
        };

        System.out.println("Introdueix una paraula que creguis que està en el array");
        String paraula= input.nextLine();

        for(int i =0; i< palabras.length; i++){
            if(palabras[i].contains(paraula)){
                System.out.println("Paraula trobada: " + paraula);
                paraulaTrobada=true;

            };

        }

        if(!paraulaTrobada){
            System.out.println("No s'ha trobat la paraula");
        }



    }
}


/*Buscador de Palabras:

Crea un programa que tome una palabra como entrada desde el usuario.
Busca esa palabra en un array predefinido de palabras.
Indica si la palabra se encuentra o no en el array.*/

