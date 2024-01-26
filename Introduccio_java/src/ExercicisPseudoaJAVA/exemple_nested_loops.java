package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class exemple_nested_loops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Siusplau, introdueix un nombre");
        int num = input.nextInt();

        // j es linea
        // i es columna

        //es per fer un codi amb totes les taules
        System.out.println("Siusplau, introdueix un nombre");
        for(int j = 1; j <= num; j++) {
            System.out.println("La tabla del " + j);
            for(int i = 1; i <= 10; i++) {
                System.out.println(i+"x" +j+"=" + (i*j)); //1*5=5
            } //incrementa +1
            System.out.println("Genial");
        } // incrementa cuando i vale 11 q la condiion no se cumple i sale, entonces incrementa la J  +1
         input.close();
    }
}   //FLUJO DE EJECUCIÓN
/*1= entramos en el for la j vale 1 miramos si j es mas pequeña q el num del usuario (5) (NO INCREMENTAMOS AUN)
  2= entramos en el for de dentro la i vale 1 miramos si es menos o igual a 10 (si) (NO INCREMENTAMOS AUN)
  3= imprimimos el 1 de la j i el 1 de la 1 i ademas los multiplicamos imprimira= 1*1=1;
  4= directamente acaba el print i ya le suma uno i sigue con el bucle de dentro
  5= No sale del bucle hasta que la condicion no sea falsa. Entonces repite el 1 de la j por los incementos
     de la i es decir 1*2=2 1*3=3.....
  6= cuando la i llega a valer 10 que lo imprime i entonces  sale del bucle, AQUI SE INCREMENTA LA J I VALDRA 2
     I VOLVERÀ A EMPEZAR ej: int i =2; el 2 es mas pequeño que (5) SI entonces imprime la tabla del 2... i entra
     en el bucle for de dentro.

 */