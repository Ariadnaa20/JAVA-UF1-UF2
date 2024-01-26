package ExercicisPseudoaJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Exercici15Pseudo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;


        System.out.println("Ordenem numeros");

        // la inicializamos
        double[] numeros= new double[3];

        //pedimos al usuario que ingrese los numeros
        for(int i =0; i<3; i++){ // el bucle se ejecuta 3 veces  i<3 es la posicion si ponemos primero un 6 sera 0...
            System.out.println("Ingresa un numero" + (i+1) + ":");
            numeros[i]=scanner.nextDouble(); //los lea
        }
        // Menú de opciones
        System.out.println("Elige una opción:");
        System.out.println("1. Ordenar de forma ascendente");
        System.out.println("2. Ordenar de forma descendente");
        opcion = scanner.nextInt();

        //ordenar
        // Ordenar los números según la opción elegida
        if (opcion == 1) {
            Arrays.sort(numeros); // ordenar pero como:
            for (double numero : numeros) { //manera de acceder a los numeros es como una pseudoclase
                System.out.println(numero);
            }
        } else if (opcion == 2) {
            Arrays.sort(numeros); // Ordenar de forma descendente
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println(numeros[i]);
            }

        } else {
            System.out.println("Opción no válida.");
            return;
        }






    }
}

    //la condición i < 3 en el bucle for significa que el bucle se repetirá hasta que i sea menor que 3. En otras palabras, el bucle se ejecutará tres veces en total, ya que i comienza en 0 y se incrementa en 1 en cada iteración (debido a la expresión i++). Por lo tanto, se realizarán tres iteraciones, una para cada número que se debe ingresar.
