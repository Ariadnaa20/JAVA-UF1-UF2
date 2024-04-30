package UF2_PROGRAMACIO_MODULAR.RECURSIVITAT;

import java.util.Scanner;

public class MenuRecursisu {

    public static void main(String[] args) {
        inici();

    }

    public static void inici(){
        System.out.println("******************************");
        System.out.println("Hola benvingut/da al programa:");
        System.out.println("******************************");

        menuPrincipal();
        int opcioescollida= llegirInt("opcio escollida", 3, 4);
        System.out.println(opcioescollida);
    }

    /**
     * Menu prinipal i en cada cas es repeteix l'opcio cridant al menú(casos recursius) i el cas base es el 3 */

    public static void menuPrincipal(){
        Scanner input= new Scanner(System.in);
        System.out.println();

        /*en lloc de posar input.nextInt. Li assigno un metode que ens ho fa, segons el valor correcte i l'opció*/

        int opcio= llegirInt("Escriu una opció de menú: \n 1 \n 2 \n3", 1, 3);

        switch(opcio){
            case 1:
                System.out.println("Hola! Cas 1");
                menuPrincipal(); // Cas recursiu torna a cridar el menu
                break;

            case 2:
                System.out.println("Hola! Cas 2");
                menuPrincipal(); // Cas recursiu
                break;

            case 3: // CASE BASE DE LA RECURSIVITAT
                System.out.println("Sortint del programa... ");
                break;

            default:
                System.out.println("ERROR: Opció no vàlida!");
                menuPrincipal(); // Cas recursiu
                break;

        }


    }






    /**
    * El metode llegirInt serveix per comprovar el valor introduit per l'uusuari i tambe comprovar l'opcio del menu
    *
    * @param missatge: dirli al usuari que escolleixi una opcio del menu
     * @param min: primer valor del menu
     * @param max: ultim valor disponible del menu*/

    public static int llegirInt(String missatge, int min, int max){
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.println(missatge);
            valorCorrecte= llegir.hasNextInt(); //si es enter es un true sino unn false
            //si es TRUE no entrarà en el if

            if(!valorCorrecte){ //si es diferente a true q es lo mismo q false
                System.out.println("ERROR, no enter");
                llegir.nextLine();
            } else { //tinc un enter
                x = llegir.nextInt(); //Noli esta tornant a demanar sino que l'agafa de llegir.hasNextInt ja que no el elimina nomes verifica llavors quan tu ja fas llegir.nextInt se lio assigna el valor de hasNextInt
                llegir.nextLine();
                if (x < min || x > max ){
                    System.out.println("Opcio no valida");
                    valorCorrecte = false ;
                }
            }

        }while (!valorCorrecte); //mentre el valor correcte sigui fals es seguirà repetinnt
        return x;
    }

    //recurividad que pueda volver hasta arriba llevando un resultado conigo arrays en metodos
}


