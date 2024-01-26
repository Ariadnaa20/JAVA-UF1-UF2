package STRINGS;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nombresAlumnos = { "Maria", "Pablo", "Juan", "Esteban" };

        System.out.println("Lista de nombres de alumnos:");
        for (int i = 0; i < nombresAlumnos.length; i++) {
            if (i == nombresAlumnos.length - 1) {  //si la i es la ultima posciio
                System.out.println(nombresAlumnos[i] + '.'); //imprimim la i + el punt
            } else {
                System.out.print(nombresAlumnos[i] + ", "); // sino doncs amb una coma
            }
        }

        System.out.println("¿Qué posición deseas cambiar?");
        int posicio = input.nextInt();

        if (posicio >= 0 && posicio < nombresAlumnos.length) {
            System.out.println("El nombre actual en la posición " + posicio + " es: " + nombresAlumnos[posicio]);

            System.out.println("Introduce el nuevo nombre:");
            String nuevoNombre = input.next();

            nombresAlumnos[posicio] = nuevoNombre; //assignem el nou nom a la posicio de nomsAlumnes

            System.out.println("Nombres de los alumnos después del cambio:");
            for (int i = 0; i < nombresAlumnos.length; i++) {
                if (i == nombresAlumnos.length - 1) {
                    System.out.println(nombresAlumnos[i] + '.');
                } else {
                    System.out.print(nombresAlumnos[i] + ", ");
                }
            }
        } else {
            System.out.println("La posición ingresada no existe en el array.");
        }

        input.close();










    }
}
