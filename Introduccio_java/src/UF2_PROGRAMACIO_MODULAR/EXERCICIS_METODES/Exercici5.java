package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.Scanner;

public class Exercici5 {
    /*METODE PRINCIPALS
    MenuPrincipal();
    SeleccioConversio();
    IntroduirGraus();
    RealizacioConversió();
       - graus de celsius a fahrenheit();
       - graus de farenheight a celsius();
    ImprimirConversio();

    */
    public static void main(String[] args) {
        MenuPrincipal();
        int opcioConversio = SeleccioConversio();
        double graus= IntroduirGraus();
        double resultat= RealitzacioConversio(opcioConversio,graus);
        ImprimirConversio(resultat,opcioConversio);
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
            System.out.println("La conversio dels graus de celsius a fahrenheit: ");
            return celsiusAfahrenheit(graus); /*em retorna el resultat d'un altre metodeamb la variable */
        } else if (opcioConversio==2) {
            System.out.println("La conversio dels graus de fahrenheit a celsius: ");
            return fahrenheigtAcelsius(graus);

        }
        return opcioConversio;
    }

    public static double celsiusAfahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }


    public static double fahrenheigtAcelsius(double fareheight){
        return (5.0 / 9) * (fareheight - 32);
    }


    public static void ImprimirConversio(double resultat, int opcioConversio){
        if(opcioConversio==1){
            System.out.println("La conversio de celsius a fahrenheigt es: " + resultat);
        } else if (opcioConversio==2) {
            System.out.println("La conversio de celsius a fahrenheigt es: " + resultat);

        }
    }


}
