package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici11Pseudo {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double notaPractica=0;
        double porcentage_Practica=0.3;
        double notaExercicis=0;
        double porcentage_exercicis=0.1;
        double notaPous=0;
        double porcentage_pous=0.2;
        double notaExamen=0;
        double porcentage_examen=0.4;

        double notaFinal;


        System.out.println("Benvingut, calcula la teva nota final ");
        System.out.println("Siusplau, introdueix la teva nota en la Pràctica");
        notaPractica=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Siusplau, introdueix la teva nota en els exercicis");
        notaExercicis=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Siusplau, introdueix la teva nota en els Pou'S");
        notaPous=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Siusplau, introdueix la teva nota en el examen");
        notaExamen=scanner.nextDouble();
        scanner.nextLine();

        notaFinal=(notaExercicis*porcentage_exercicis) + (notaPractica*porcentage_Practica) + (notaPous*porcentage_pous) + (notaExamen*porcentage_examen);

        if(notaFinal>5){
            System.out.println("Estàs aprovat amb un " + notaFinal);
        } else {
            System.out.println("Estàs suspés amb un " + notaFinal);
        }

        scanner.close();
    }
}
