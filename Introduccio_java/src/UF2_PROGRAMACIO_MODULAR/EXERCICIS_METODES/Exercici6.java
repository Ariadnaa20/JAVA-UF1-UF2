package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.Scanner;

public class Exercici6 {

    /*
    MenuPrincipal();
    IntrodueixRadio();
    IntrodueixAltura();
    LlegirOpcio(); a o v
       - area
       - volumen
    *
   */
    public static void main(String[] args) {
        MenuPrincipal();


    }

    public static void MenuPrincipal(){
        Scanner input= new Scanner(System.in);
        double radio=IntrodueixRadio();
        double altura= IntrodueixAltura();
        char opcio = LlegirOpcio();

        switch (opcio) {
            case 'a':
                // Llama al método para calcular el área y pasa los parámetros
                double area = Area(radio, altura);
                System.out.println("L'àrea del cilindre és: " + area);
                break;
            case 'v':
                // Llama al método para calcular el volumen y pasa los parámetros
                double volum = Volumen(radio, altura);
                System.out.println("El volum del cilindre és: " + volum);
                break;
            default:
                System.out.println("Opció no vàlida.");
                break;
        }
    }


    public static Double IntrodueixRadio(){
        Scanner input= new Scanner(System.in);
        System.out.println("Introdueix el Radio: ");
        return input.nextDouble();


    }

    public static Double IntrodueixAltura(){
        Scanner input= new Scanner(System.in);
        System.out.println("Introdueix Altura: ");
        return input.nextDouble();

    }

    public static char LlegirOpcio() {
        Scanner input= new Scanner(System.in);
        System.out.print("Selecciona 'v' per al volum o 'a' per a l'àrea: ");
        String opcio = input.next();
        return opcio.charAt(0);  // Retorna el primer caràcter de l'entrada
    }


    private static double Area(double radio, double altura) {
        return 2 * Math.PI * radio * (radio + altura);
    }


    public static double Volumen(double radio, double altura){
        return Math.PI * Math.pow(radio, 2) * altura;

    }
}
