package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici1Pseudo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int valor=0;



        do {
            System.out.print("Introdueix un valor entre 0 i 10: ");
            valor = scanner.nextInt();

            if (valor < 0 || valor > 10) {
                System.out.println("Valor fora de rang. Si us plau, introdueix un valor entre 0 i 10.");
            }
        } while (valor < 0 || valor > 10);

        System.out.println("Valor acceptat: " + valor);
        scanner.close();
    }








    }


