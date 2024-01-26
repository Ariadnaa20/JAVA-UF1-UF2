package STRINGS;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Hola, introdeuix un text");
        String text = input.nextLine();


        //ESTA MALAMENT

        /*for (int i = text.length(); i < text.length(); i--){
            System.out.println("El text al reves es: " + text);
        }*/

        for (int i = text.length() - 1; i >= 0; i--) { // raonament: començem desde el final llavors posem length, i ha de ser mes gran o igual que 0 i llavors anem restant
            System.out.print(text.charAt(i)); // imprimim cada posicio del text que es fa amb charAt
        }
    }
}
