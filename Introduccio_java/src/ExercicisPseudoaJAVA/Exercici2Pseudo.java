package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici2Pseudo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        boolean VIP=true;
        int compra=0;
        double descuento=0.20;
        double PrecioFinal=0;

        System.out.println("Benvingut al programa de descomptes");

        System.out.println("Siusplau, escriu si ets VIP(TRUE) o en el cas contrari(FALSE)");
        VIP=scanner.nextBoolean();
        System.out.println("Gracies");

        System.out.println("Introdueix el valor de la compra");
        compra=scanner.nextInt(); //aqui es guarda la opcio que em diu
        scanner.nextLine();

        if(VIP || compra >200){
            PrecioFinal= compra - (compra*descuento);
            System.out.println("Felicitats, si que pots obtenir descompte de 20% ");
            System.out.println("El precio final es de: " + PrecioFinal);
        } else {
            System.out.println("Ho sento company, no tens dret al descompte. ");
        }
        scanner.close();


    }
}
