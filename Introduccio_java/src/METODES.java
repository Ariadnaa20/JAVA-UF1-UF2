import java.util.Scanner;

public class METODES {
    public static void main(String[] args) {
        //Aquí declaramos las instancias o variables que necesitaremos en nuestro programa
        Scanner leerteclado = new Scanner(System.in);
        int opcion =0;

        // Este es el método principal(main) dónde llamaremos a otros métodos secundarios para que realicen una función especifica
        System.out.println("Bienvenido al programa de muestra sobre programación modular");
        //Llamamos al primer método estatico que única función será printar por pantalla el menú de usuario
        MenuUsuario();
        opcion= leerteclado.nextInt();
        do {
            switch (opcion) {
                case 1 -> Sumardosnumeros(); //Llamamos a este método que su UNICA función será sumar dos números
                case 2 -> Restardosnumeros();//Llamamos a este método que su ÚNICA función será restar dos números
                case 3 -> MultiplicarDosNumeros(); //llamamos a este método que su ÚNICA función será multiplicar dos números
                case 4 -> MensajeSalida();// Llamamos a este método que su ÚNICA función es mostrar un mensaje de salida.
                default -> System.out.println("Opción no permitida, vuelvelo a intentar.");
            }
            MenuUsuario();
            opcion= leerteclado.nextInt();
        }while(opcion!=4);
    }
    private static void MensajeSalida() {
        System.out.println("Gracias por utilizar nuestro programa de muestra sobre Programación Modular");
    }

    private static void MultiplicarDosNumeros() {
        //INICIO - DECLARACIÓN VARIBALES
        int num1 =0;
        int num2=0;
        int result=0;
        Scanner numeros = new Scanner(System.in); // Para poder guardar los valores que me pone el usuario por teclados
        //FIN - DECLARACIÓN VARIABLES

        System.out.println("Acabas de entrar en el método que multiplicará dos valores y te dará el resultado");
        System.out.println("Introduce el PRIMER número entero que quieres multiplicar");
        num1 = numeros.nextInt();
        System.out.println("Introduce el SEGUNDO número entero que quieres multiplicar");
        num2= numeros.nextInt();
        result = num1*num2;
        System.out.println("El resultado de las multiplicación es: "+ result );
    }

    private static void Restardosnumeros() {
    }
    //Aqui tendria que ir el codigo par restar dos numeros
    private static void Sumardosnumeros() {
    }
    //Aquí tendria que ir codigo para poder sumar dos números
    private static void MenuUsuario() {
        /*La única función de este método es escribir por pantalla el
        menú con las diferentes opciones a escoger por el usuario
         */
        System.out.println("Porfavor, escoge una de las opciones disponibles");
        System.out.println("Opción 1: Sumar dos números");
        System.out.println("Opción 2: Restar dos números");
        System.out.println("Opción 3: Multiplicar dos números");
    }
}
