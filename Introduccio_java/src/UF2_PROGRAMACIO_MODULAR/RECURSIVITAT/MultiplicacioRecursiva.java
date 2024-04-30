package UF2_PROGRAMACIO_MODULAR.RECURSIVITAT;

import java.util.Scanner;

public class MultiplicacioRecursiva {
    public static void main(String[] args) {
        inici();
    }

    public static void inici(){
        llegirFloats();
    }

    public static void llegirFloats(){
        Scanner llegir = new Scanner(System.in);
        float a = 0;
        float b =0;
        float resultat = 0;

        System.out.print("Escriu el primer número de la multiplicació: ");
        a = llegir.nextFloat();
        llegir.nextLine();

        System.out.print("Escriu el segon número de la multiplicació: ");
        b = llegir.nextFloat();
        llegir.nextLine();

        resultat = multiplicarRecursiu(2 , 3);
        System.out.println("El resultat es: " + resultat);
    }




    private static float multiplicarRecursiu (float a, float b){
        if (b==0){ //qualsevol num multiplicat per 0 es 0
            return 0;
        } else{
            return a + multiplicarRecursiu(a , b -1); //se ejecutara 3 veces entonces  3 + 3 6
        }

    }
}
