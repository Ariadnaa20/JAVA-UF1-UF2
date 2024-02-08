package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.Scanner;

public class Exercici4 {

    /*METODES PRINCIPALS:
    MenuPrincipal();
    LlegirVenta();
    CalcularBonificacio();
    ImprimirBonificacio();
    */
    public static void main(String[] args) {
        MenuPrincipal();

    }

    public static void MenuPrincipal(){
        int ValorVenta= LlegirVenta();
        double bonificacio= CalcularBonificacio(ValorVenta);
        ImprimirBonifiacio(ValorVenta, bonificacio);


    }

    public static int LlegirVenta(){
        Scanner input= new Scanner(System.in);
        int importVenta=0;
        System.out.println("Introdueix l'import de la teva venta");

        return input.nextInt();
    }


    public static double CalcularBonificacio(int importVenta){
        double bonificacio = 0;
        if (importVenta < 20000) {
            bonificacio = 7000 + (0.02 * importVenta);
        } else if (importVenta >= 20000 && importVenta <= 50000) {
            bonificacio = 15000 + (0.03 * importVenta);
        } else if (importVenta > 50000) {
            bonificacio = 20000 + (0.12 * importVenta);
        }

        return bonificacio;

    }

    public static void ImprimirBonifiacio(int importVenta, double bonificacio){
        System.out.println("La teva venta de " + importVenta + " li correspon " + bonificacio + " de bonifiacio");
    }

}
