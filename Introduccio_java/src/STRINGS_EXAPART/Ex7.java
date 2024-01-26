package STRINGS_EXAPART;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Ingrese la cantidad de frases que desea introducir: ");
        int cantidadFrases = input.nextInt();
        input.nextLine();  // Consumir el salto de línea pendiente después del nextInt

        // Crear un array para almacenar las frases
        String[] frases = new String[cantidadFrases];

        for(int i=0; i<frases.length; i++){
            System.out.println("Les frases son: " + (i+1) + ": ");
            frases[i]=input.nextLine();
        }

        System.out.println("Les frases introduides son: " + Arrays.toString(frases));

        System.out.println("A continuació sabrem quantes paraules uniques hi han");

        String paraulesUniques= " ";

        for(int i =0; i<frases.length; i++){
            String[] paraules= frases[i].split(" ");  // estem fent una array amb les paraules separades

            for(int j=0; j< paraules.length; j++){
                if(!paraulesUniques.contains(paraules[j])){
                    paraulesUniques += paraules[j] + " ";
                }

            }
        }

        // Imprimir palabras únicas
        System.out.println("Palabras únicas en todas las frases:");
        System.out.println(paraulesUniques);

    }
}
