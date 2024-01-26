package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici7Pseudo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int salariBase=1250;
        int horesExtra=0;
        boolean riesgoCovid= false;


        System.out.println("Hola, benvingut al programa de calcular et teu sou.");
        System.out.println("Siusplau, introdueix quantes hores extra treballes");
        horesExtra=scanner.nextInt();
        System.out.println("Hores llegides");

        System.out.println("Siusplau, introdueix si tens exposició al Covid19 ");
        riesgoCovid=scanner.hasNextBoolean();
        System.out.println("Resposta llegida");

        if(riesgoCovid){
            salariBase +=250.0;
            salariBase += horesExtra *5.0;
        }else {
            if (horesExtra <= 5){
                salariBase += horesExtra *15.0;
            }else{
                salariBase += 5 * 15.0 + (horesExtra -5) * 12.0;
            }
        }

        System.out.println("El salari total es: " + salariBase+ "$");

        scanner.close();



    }
}
