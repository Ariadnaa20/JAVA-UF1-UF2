package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici9Pseudo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double venda1=0;
        double venda2=0;
        double venda3=0;
        double salari_Base=0;
        double total_vendas=0;
        double totalVendesSalari;
        double comision=0.10;




        System.out.println("Benvingut al programa de calcular la teva venda");
        System.out.println("Siusplau, introdueix el teu salari base:");
        salari_Base=scanner.nextDouble();

        System.out.println("Siusplau, introdueix l'import de la primera venda");
        venda1=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Siusplau, introdueix l'import de la segona venda");
        venda2=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Siusplau, introdueix l'import de la tercera venda");
        venda3=scanner.nextDouble();
        scanner.nextLine();



        total_vendas=(venda1 + venda2 + venda3) * comision;
        System.out.println("El total de les vendes aplicant el 10% de comisió es:" + total_vendas);


        totalVendesSalari=salari_Base+total_vendas;
        System.out.println("El total es: " + totalVendesSalari);

        scanner.close();






    }
}
