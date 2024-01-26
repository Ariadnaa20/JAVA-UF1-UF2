package STRINGS;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean titol_Trobat= false;

        String[] catalogo = {
                "Los muertos vivientes",
                "Brevísima historia del tiempo",
                "La clave secreta del universo",
                "Mi universo",
                "Patria",
                "De mayor quiero ser feliz",
                "Empieza por los zapatos"
        };

        System.out.println("Escriu el titol del llibre que vols trobar");
        String titol = input.nextLine();

        for (int i =0; i< catalogo.length; i++){
            if(catalogo[i].equalsIgnoreCase(titol)){
                titol_Trobat=true;
            }
        }

        if(titol_Trobat){
            System.out.println("Titol trobat " + titol_Trobat);
        }else{
            System.out.println("el titol no s'ha trobat");
        }




    }
}
