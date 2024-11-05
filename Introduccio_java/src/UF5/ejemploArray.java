package UF5;

import ARRAYS.Array;



public class ejemploArray {

    public static void main(String[] args) {
        // Array de notas
        double[] notas = {7.5, 8.0, 6.5, 9.0, 4.0, 10.0, 5.5};

        // Calcular la suma de las notas
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {  // Bucle for normal
            suma += notas[i]; // Sumar cada nota al total
        }

        // Calcular el promedio
        double promedio = suma / notas.length;

        // Mostrar el promedio
        System.out.println("El promedio de las notas es: " + promedio);
    }
    }

