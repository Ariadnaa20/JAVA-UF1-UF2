package STRINGS_EXAPART;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean trobat= false;

        String[] catalogo = {
                "Los muertos vivientes",
                "Brevísima historia del tiempo",
                "La clave secreta del universo",
                "Mi universo",
                "Patria",
                "De mayor quiero ser feliz",
                "Empieza por los zapatos"
        };

        System.out.println(Arrays.toString(catalogo));

        System.out.println("Introdueix quina substring vols extreure:");
        String susbtring= input.nextLine();

        for(int i=0; i< catalogo.length; i++){
            if (catalogo[i].contains(susbtring)){
                System.out.println("La substring està inclosa en el cataleg");

                System.out.println("Les lletres de la substring del: " + catalogo[i] + " son: " );
                for(int j=0; j< catalogo.length; j++){
                    char lletra = susbtring.charAt(j);
                    System.out.println("La lletra es: " + lletra);
                }
                System.out.println();
                trobat=true;

            }




        }





        if(!trobat){
            System.out.println("No s'ha trobat");
        }






    }
}


/*
¡Por supuesto! Aquí tienes algunos ejercicios adicionales que implican la búsqueda de palabras o frases en arrays de strings:


Palabra más Larga:

Toma un array de palabras.
Encuentra y muestra la palabra más larga presente en el array.
Utiliza el método length() de la clase String para determinar la longitud de cada palabra.*/

