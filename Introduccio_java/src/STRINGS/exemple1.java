package STRINGS;

import java.util.Scanner;

public class exemple1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final int MAX_PALABRAS =5;
        String todasLasPalabras = ""; // Cadena para almacenar todas las palabras

        System.out.println("Introduce " + MAX_PALABRAS + " palabras (separadas por espacios).");
        System.out.println("Puedes escribirlas en líneas diferentes, si quieres.");


        for (int i = 0; i < MAX_PALABRAS; i++) {
            String palabra = input.next(); //Leemos palabra a palabra
            System.out.println("Palabra #" + i + ": " + palabra);
            todasLasPalabras += palabra + " "; // Agregamos la palabra a la cadena
        }
        System.out.println("Las palabras seguidas son: " + todasLasPalabras);

        //EJEMPLO OBJECTO

        // Ejemplo de uso del objeto Persona
        Persona persona = new Persona("Ari", "Femenino", 19, 123456789, "ari@example.com");
        persona.adquirir(5); // Llamamos al método adquirir de persona.
        System.out.println("Cantidad adquirida por " + persona.nombre + ": " + persona.comprar);
    }


        static class Persona {

            //atributos

            String nombre;
            String genero;
            int edad;
            int telefono;
            String correo;
            int comprar;

            //constructor
            public Persona() {
            }


            public Persona(String nombre, String genero, int edad, int telefono, String correo) {


                this.nombre = nombre;
                this.genero = genero;
                this.edad = edad;
                this.telefono = telefono;
                this.correo = correo;


            }

            // metodos tots els que vulguis, infinits .
            public void adquirir(int quantity){
                this.comprar=+quantity;
            }

        }

    }



