package STRINGS;

public class Ex1 {
    public static void main(String[] args) {
                double d = 858.48;  //s'asgina el valor de la variable
                String s = String.valueOf(d); // es converteix el valor de d a una cadena de text gracies al metode String.valueOf(d) i el resultat es guarda a s "858.48"
                int punto = s.indexOf('.'); // es busca el primer punt i es guarda a dot
                System.out.println(punto+" digits before decimal point"); // es conten els digits abans del punt i ho imprimeix
                System.out.println((s.length()-punto-1)+" digits after decimal point"); // 6-3-1=2




        // Convertir un valor booleano a String
        boolean boolValue = true;
        String fromBool = String.valueOf(boolValue);
        System.out.println(fromBool); // Imprime "true"

       // Convertir un valor entero a String
        int intValue = 123;
        String fromInt = String.valueOf(intValue);
        System.out.println(fromInt); // Imprime "123"

       // Convertir un caracter a String
        char charValue = 'A';
        String fromChar = String.valueOf(charValue);
        System.out.println(fromChar); // Imprime "A"

       // Convertir un valor de punto flotante a String
        float floatValue = 1.23f;
        String fromFloat = String.valueOf(floatValue);
        System.out.println(fromFloat); // Imprime "1.23"




    }
}


/*El siguiente código usa distintos métodos de la clase String. Ejecútalo e indica cual es la salida por
consola. ¿Qué métodos de la clase String se utilizan? ¿Son estáticos o de instancia? ¿Qué función tiene
cada uno de estos métodos? ¿Qué devuelven? ¿Qué parámetros de entrada tienen?

Doncs :
   - String.ValueOf(d) converteix un double en una cadena s'strings i es guarda a la variable s. Es estàtic crida a la classe. I retorna una cadena que respresenta el valor de d
   - s.IndexOf('*') guarda la posicio del punt. imprimeix 3 pq al final la posicio del punt es 3. Instancia crida a instancia particular. Torna la posicio del primer caracter
   - s.length(): saber la llargada. Metode de Instància. Imprimeix la cantitat de digits despres del punt
   */


