package introduccioJAVA;

public class HelloWorld {   //XULETARI EXAMEN
    public static void main(String[] args){
        System.out.println("Hola que tal");

       //dos tipos de maneras de declarar variable
        boolean ejemploclase1=true;
        System.out.println(ejemploclase1);

        String ejemplo1;

        //decalrem variables



        boolean isLogin=true; //una variable no es pot repetir
        System.out.println(true);

        float ratioInternet= 37.5f;  // 6 digits float es un decimal mes curt. dos palabras pues poner la segona iniciar con mayuscula
        System.out.println(ratioInternet);

         final double budget = 13450.99; // double 15 digits si o si sera aquest resulat.
        System.out.println(budget);

        char letter='a';   // las variables la primera letra es en minuscula pero quan son dos palabras juntes pues la segona es en Mayuscula
        System.out.println(letter);

        long numeroTelefono=666356743;   //admite numeros enteros sin decimales
        System.out.println(numeroTelefono);

        String greeting= "Hello World";


        //Aritmetica


         //Aritmetica Suma i resta es lo mismo
        int passengers=0;
        passengers=passengers + 10;
        System.out.println(passengers);

        int add= 1 + 2; //=3

        int value= 2;
        value ++; //=3. Agregar uno mas directamente

        //Aritmetica multiplicacion i division
        int multiplication = 3 * 4; //=12
        int div= 5 / 2;
        int value1 = (4+6) * 7; //70 siempre primero los parentesis

        double div2= 5 / 2.0; //=2.5
        int aux= 5 % 2; //=1 si volen que ens surti el restante de una divsion

        // ejemplo propina
        double precioMenu=23.5;
        double pagado=30;
        double propina=(pagado - precioMenu) * 0.10;
        System.out.println(propina);





        //CONCATENACIO STRINGS

       /*String nombre= "Ariadna";
       String apellido="Pascual";
       String nombreCompleto= nombre+" "+apellido;
        System.out.println(nombreCompleto);*/

        String nombre= "Ariadna";
        String apellido="Pascual";

        int pisos = 0;
        pisos++;

        System.out.println("L'"+ nombre+ " " +apellido + " " + "sube cada dia" +" "+ pisos +" "+ "pisos" );






    }
}

