package STRINGS;

import java.util.Scanner;

public class teoriaPDF {
    public static void main(String[] args) {
        String miString; // Declaración
        miString = "Hola"; // Inicialización
        String otroString = "Mundo"; // Declaración e inicialización
        String message = ""; //Objecte buit



        /*Inmutabilitat: Quan es crea un string el seu contingut no pot cambiar. Pot ser que sembli que
        l'estiguem cambiant pero en veritt estem creant un nom
         */
        String s = "Hola";
        s = s + " Mundo"; // Crea un nuevo string "Hola Mundo" //concatenación



        /*UPDATE*/
        String message1 = "Hello, world"; // message apunta a un objeto string que contiene "Hello, world"
        message1 = "Java is fun"; // Ahora message apunta a un nuevo objeto string que contiene "Java is fun". Encara que ho substituim encara existeix


        //COMPARACIÓN
        String a = new String("Prueba");
        String b = new String("Prueba");
        boolean resultado = a.equals(b); // true



        //EXEMPLE DE OUTPUT
        String message2 = "Hello, world";
        System.out.println(message); // Output: Hello, world


        //EXEMPLE D'INPUT NEXT LINE
        Scanner input= new Scanner(System.in);
        System.out.println("Introdueix una linea");
        String frase = input.nextLine();
        System.out.println("El contintingut introduït es: " + frase);

        //EXEMPLE D'INPUT NEXT
        Scanner input1 = new Scanner(System.in);
        System.out.println("Introdueix una paraula");
        String paraula = input.next();
        System.out.println("El contingut introduït es: " + paraula);

        // INPUT NEXT AMB CONTADOR
        Scanner input3 = new Scanner(System.in);
        int MAX_PARAULES= 5;
        System.out.println("Introdueix un maxim de " + MAX_PARAULES);

        for (int i =0; i<MAX_PARAULES; i ++){
            String paraula3= input3.next();
            System.out.println("La paraula es: " + paraula3);
        }


    }
}
