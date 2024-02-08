package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        MenuPrincipal();

    }

    public static boolean MenuPrincipal(){
        int numero= NumeroIntroduit();
        if (esPar(numero)) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        return false;
    }


    public static int NumeroIntroduit(){
        Scanner input= new Scanner(System.in);
        System.out.println("Introdueix un numero:");
        return input.nextInt();


    }

    public static boolean esPar(int numero){
        return numero % 2 == 0; // Devuelve true si el número es par, false si es impar.
    }




}
