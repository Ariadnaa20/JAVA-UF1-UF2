package STRINGS;

import java.util.Scanner;

public class Calculadora2 {   // aixo es el que ha demanat a clase


    public static void main(String[] args) {
         // Crear una instancia de Calculadora2
        Scanner scanner = new Scanner(System.in);



        System.out.println("Introduce el primer número para la suma:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número para la suma:");
        int num2 = scanner.nextInt();



        int resultado = SumaCalculadora(num1, num2); // utlitzem aqui el metode
        System.out.println("Resultado de la suma: " + resultado);
    }


    // metode per crear la operacio suma

    public static int SumaCalculadora(int a, int b){
        return a + b;
    }

}


