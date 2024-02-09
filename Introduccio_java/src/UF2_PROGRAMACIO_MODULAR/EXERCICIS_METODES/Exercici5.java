package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.Scanner;

public class Exercici5 {
    /*METODE PRINCIPALS
    MenuPrincipal();
    SeleccioConversio();
    IntroduirGraus();
    RealizacioConversió();
    ImprimirConversio();

    */
    public static void main(String[] args) {
        MenuPrincipal();
        int opcioConversio = SeleccioConversio();
        double graus= IntroduirGraus();

    }

    public static void MenuPrincipal(){
        System.out.println("Benvingut a la la conversió entre Celsius a Fahrenheit o de Fahrenheit a Celcius");
    }

    public static int SeleccioConversio(){
        Scanner input= new Scanner(System.in);
        System.out.println("Escull opcio: ");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celcius");
        return input.nextInt();
    }

    public static double IntroduirGraus(){
        Scanner input= new Scanner(System.in);
        System.out.println("Introdueix els graus: ");
        return input.nextDouble();

    }

    public static double RealitzacioConversio(int opcioConversio, double graus){
        if(opcioConversio==1){

        }
    }
}
