package UF2_PROGRAMACIO_MODULAR.IVA;

import java.util.Scanner;

public class PascualAriadna_PVP {
    public static void main(String[] args) {
        float cost = demanarCostProducte();
        float preuVenda = calcularPreuVenda(cost);
        System.out.println("El preu de venda al públic és: " + preuVenda);
    }



    // Mètode per llegir un float amb control d'errors
    private static float llegirFloatTeclat() {
        Scanner scanner = new Scanner(System.in);
        float valor = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Introdueix un valor float: ");
            if (scanner.hasNextFloat()) {
                valor = scanner.nextFloat();
                valid = true;
            } else {
                System.out.println("Error: Introdueix un valor float vàlid.");
                scanner.nextLine(); // Consumir la línia incorrecta
            }
        }

        return valor;
    }



    // Mètode per demanar el cost del producte final a l'usuari
    private static float demanarCostProducte() {
        System.out.println("Introdueix el cost del producte:");
        return llegirFloatTeclat();
    }




    // Mètode per calcular el preu de venda amb l'increment d'IVA +21%
    private static float calcularPreuVenda(float cost) {
        float iva = 0.21f;
        return cost * (1 + iva);
    }
}

