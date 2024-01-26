package STRINGS;

public class Calculadora {



    // Constructor de la clase
    public Calculadora() {
        // Aquí puedes inicializar cualquier variable si es necesario
    }

    // Método para sumar dos números
    public int suma(int numero1, int numero2) {   //metodo que envia
        return numero1 + numero2;
    }

    // Método para restar dos números
    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }





    // Método principal para probar la calculadora
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); // Crear una objecte instancia de Calculadora

        // Probar el método suma
        int resultadoSuma = calc.suma(5, 3); // calc es l'objecte i suma es la funcio metode de suma
        System.out.println("Suma: 5 + 3 = " + resultadoSuma);

        // Probar el método resta
        int resultadoResta = calc.resta(5, 3);  // calc es l'objecte i suma es la funcio metode de suma
        System.out.println("Resta: 5 - 3 = " + resultadoResta);
    }
}










