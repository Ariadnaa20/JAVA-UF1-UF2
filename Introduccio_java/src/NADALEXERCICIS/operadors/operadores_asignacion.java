package NADALEXERCICIS.operadors;

public class operadores_asignacion {
    public static void main(String[] args) {

        int x=  5;
        int y;

         y = x++;


        System.out.println("Imprimint y: " + y);
        /* jo pensaria que el valor impres seria 6 ja que x++ es 6 i se li asigna a y perp NO
         el ++ es un sufix: pasos:
        1: y= x llavors y val 5
        2: x= despres la x val 6 ja que li incrementa ++
        primer la assignacio i despres l'increment

        Si fos Y = ++X primer incrementaria la x i despres li asignaria el valor a i es a dir x=6 i y=6
        primer l'increment despres l'assignacio */

        System.out.println("Imprimint x: " + x);




        // OPERADORES DE ASSIGNACIÓN

        int edad=3;


        System.out.println("OPERADOR += ");

        edad += 3;  // el resultat es 6 ja que li estem sument i igualant  la edad
                       // edad = edad + 6
                       // edad serà igual a edad + 3
        System.out.println(edad);


        System.out.println("OPERADOR -= ");

        edad -= 1;   // 6-1
        System.out.println(edad);

        System.out.println("OPERADOR *= ");

        edad *=edad;   // 5x5
        System.out.println(edad);


        System.out.println("OPERADOR /= ");

        edad /= edad;  // 5/5= 1
        System.out.println(edad);




    }
}
