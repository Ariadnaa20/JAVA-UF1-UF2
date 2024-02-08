package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.Scanner;

public class Exercici1 {

    /*METODES EMPRATS:
    Metode prinipal on es criden els altres
    Metode LlegirNumero
    Metode ComprovarNumero

    * */
    public static void main(String[] args) {
        MetodePrincipal();

    }

    public static void MetodePrincipal(){
        int numero= LlegirNumero();
        boolean esPar = ComprovarNumero(numero); //li asigno el el metode a una variable
        boolean ImprimirMissatge = EsPar(esPar, numero);

    }

    public static int LlegirNumero(){
        Scanner input= new Scanner(System.in);
        int numero=0;
        System.out.println("Introdueix un numero: ");
        return input.nextInt();

    }

    public static boolean ComprovarNumero(int numero){  //retorna si es true o false
        return numero % 2 == 0;

    }

    public static boolean EsPar(boolean esPar, int numero){
        if(esPar){
            System.out.println("El numero " + numero + " es par.");
        } else{
            System.out.println("El numero " + numero + " no es par");
        }
      return esPar;
    }




}
