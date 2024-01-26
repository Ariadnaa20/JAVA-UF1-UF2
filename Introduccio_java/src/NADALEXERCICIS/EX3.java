package NADALEXERCICIS;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean EstatFigura= false;
        double PreuFigura=0.00d;
        double Bon_Estat=0.25d;
        double Mal_Estat=0.10d;
        double Total=0;
        double Increment=0;

        double DescompteTotal;


        System.out.println("Hola, depen del estat de la figura podras revendrela per mes o menys");
        System.out.println("Introdueix el preu de la teva figura");
        PreuFigura=input.nextDouble();



        System.out.println("Siusplau, digues si te bon estat (true) o no (false)");
        EstatFigura=input.nextBoolean();



        if(EstatFigura){
            System.out.println("Com es en bon estat pots La teva revenda es  del 25%");
            Increment= PreuFigura*Bon_Estat;
            System.out.println("La revenda es de: " + Increment);
            Total=PreuFigura+Increment;

            System.out.println("En resum ho pots vendre per: " + Total);


        } else {
            System.out.println("La teva revenda es del 10%");
            Increment= PreuFigura*Mal_Estat;
            System.out.println("La revenda es de: " + Increment );
            Total=PreuFigura+Increment;

            System.out.println("En resum ho pots vendre per: " + Total);

        }
    }
}
