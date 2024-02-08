package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercici2 {

    /*METODES EMPRATS:
    MenuPrincipal();
    LlegirNumeros();
    CalcularNumerosPrimitiva();
    ComprovarNumerosAcerts();
    ImprimirNumerosAcerts();

    */
    public static void main(String[] args) {
        MenuPrincipal();

    }

    public static void MenuPrincipal(){
        int[] numeros = LlegirNumeros();
        int[] NumerosRandom= CalcularNumerosPrimitiva();
        int acerts = ComprovarNumerosAcerts(numeros, NumerosRandom);
        ImprimirNumerosAcerts(acerts);


    }

    public static int[] LlegirNumeros(){
        Scanner input= new Scanner(System.in);
        int[] numeros= new int[6];

        for (int i =0; i<numeros.length; i++){
            System.out.println("Introdueix el nombre " + (i+1));
            numeros[i]=input.nextInt();
            System.out.println("Nombre introduit correctament");
        }

        System.out.println("Els numeros introduits son: ");
        for (int i =0; i< numeros.length; i++){
            System.out.println(numeros[i]);
        }

        return numeros;
    }

    public static int[] CalcularNumerosPrimitiva(){
        Scanner input= new Scanner(System.in);
        int[] NumerosRandom = new int[6];

        for (int i=0; i<NumerosRandom.length; i++){
            NumerosRandom[i]= ThreadLocalRandom.current().nextInt(1, 50);
        }
        return NumerosRandom;

    }

    public static int ComprovarNumerosAcerts(int[] NumerosUsuari, int[] RandomNumeros ){
        int acerts=0;

        for(int i =0; i<NumerosUsuari.length; i++){
            for(int j=0; j<RandomNumeros.length; j++){
                if(NumerosUsuari[i]==RandomNumeros[j]){
                    acerts++;
                }
            }
        }

        return acerts;

    }

    public static void ImprimirNumerosAcerts(int acerts){
        System.out.println("El numero d'acerts es " + acerts);

    }
}
