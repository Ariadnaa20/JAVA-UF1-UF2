package NADALEXERCICIS;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int valor;

        System.out.println("Hola, introdueix un valor no negatiu i que estigui entre el 0 i 10");
        valor= input.nextInt();

        if(valor>=0 && valor<=10){
            System.out.println("numero correcte. El numero que has introduit es: " + valor);
        }else {
            System.out.println("valor incorrecte.");
        }

    }
}
