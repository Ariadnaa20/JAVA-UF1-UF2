package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class EXERCICI5EXAMEN {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //VARIBALES
        /* les variables serán utilitzades al llarg del codi.
         * Es important inicialitzarles amb els seus corresponents valors:   */

        int opcio=0;
        String ultimaIncidencia = ""; //Variable per guardar la útlima incidencia
        int numeroIncidencias = 0;

        do{

            System.out.println("Quin producte vol?\n1. Registrar incidencia\n2. Consultar ultima incidencia registrada \n3. Consulatr numero de incidencies que s'ha registrat\n4. Sortir");
            opcio = input.nextInt();
            input.nextLine();// Consumir la nueva línea pendiente

            switch (opcio) {
                case 1:
                    System.out.println("Introdueixi el aula:");
                    String aula = input.nextLine();
                    System.out.println("Introdueixi el nom de la persona que informa de la incidencia:");
                    String persona = input.nextLine();
                    System.out.println("Introdueixi el departament de la persona:");
                    String departamento = input.nextLine();

                    System.out.println(ultimaIncidencia = "Aula: " + aula + ", Informat por: " + persona + ", Departament: " + departamento);
                    numeroIncidencias++;

                    System.out.println("Incidencia registrada amb éxit.");

                    break;

                case 2:

                    if (!ultimaIncidencia.isEmpty()) {  //jo interpreto que s'ha de comprovar que no hi hagi ja una incidencia. No se si et referies aixo
                        System.out.println("Última incidencia registrada:");
                        System.out.println(ultimaIncidencia);
                    } else {
                        System.out.println("No hay incidencias registradas.");
                    }
                    break;
                case 3:
                    System.out.println("Número de incidencias registradas: " + numeroIncidencias);
                    break;


                case 4:
                    System.out.println("Sortint del programa.");

                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;

            }
        } while (opcio != 4);
        System.out.println("Gracies per utlitzar el programa que gestiona les incidencies");

        input.close();


    }
}
