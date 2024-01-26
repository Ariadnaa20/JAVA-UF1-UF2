package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici14Pseudo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         double velocitat_Kilian=0;
         double velocitat_Pau=0;
         double distancia_Kilian=82.5;
         double distancia_Pau=78.2;
         double distanciaMaxima=171.0;

        System.out.println("Siusplau, digues a quina velocitat va en Kilian");
        velocitat_Kilian=scanner.nextDouble();
        System.out.println("El Kilian a aquesta velocitat" + velocitat_Kilian + "k/h");

        System.out.println("Siusplau, digues a quina veloictat va en Pau");
        velocitat_Pau=scanner.nextDouble();
        System.out.println("El Pau va a aquesta velocitat" + velocitat_Pau+ "k/h");

        while (distancia_Kilian < distanciaMaxima && distancia_Pau < distanciaMaxima) {
            double tiempo = 1.0; // Suponemos que cada iteración es de 1 hora (puede ser ajustado)
            distancia_Kilian += velocitat_Kilian * tiempo;
            distancia_Pau += velocitat_Pau * tiempo;
        }

        if(distancia_Kilian>distancia_Pau){
            System.out.println("Arribara abans a la meta en Kilian ja que ha recorregut mes" + distancia_Kilian);
        } else if(distancia_Pau>distancia_Kilian) {
            System.out.println("Arribara abans a la meta en Pau ja que ha recorregut mes" + distancia_Pau );
        } else {
            System.out.println("Es un empate");
        }

    }
}
