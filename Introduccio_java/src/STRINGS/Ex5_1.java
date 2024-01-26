package STRINGS;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        boolean titolTrobat= false;

        String[] catalogo = {
                "Los muertos vivientes",
                "Brevísima historia del tiempo",
                "La clave secreta del universo",
                "Mi universo",
                "Patria",
                "De mayor quiero ser feliz",
                "Empieza por los zapatos"
        };

        System.out.println("Escriu la paraula del llibre que vols trobar");
        String paraula = input.nextLine();




        for(int i =0; i<catalogo.length; i++){
            if(catalogo[i].toLowerCase().contains(paraula)){ // si la paraula conte
                System.out.println("Titol trobat: " + catalogo[i]);
                titolTrobat=true;

            }
        }

        if(!titolTrobat){
            System.out.println("Cap titol trobat");
        }


    }
}
