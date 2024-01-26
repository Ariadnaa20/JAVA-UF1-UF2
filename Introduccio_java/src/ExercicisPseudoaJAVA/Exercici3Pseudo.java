package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici3Pseudo {
    public static void main(String[] args) { //no cal posar el
        Scanner scanner = new Scanner(System.in);
        boolean figura=false;
        double importfinal = 0;
        double preufigura= 0;
        double descompte1 = 0.25;
        double descompte2 = 0.10;


        System.out.println("Benvingut a Wallapop. Siusplau, introdueix si la figura esta en bon estat");


        if (figura) {
            importfinal= preufigura*descompte1;
            scanner.nextLine();
            System.out.println("Aplicat l'import per bon bon estat import final=" + importfinal); //ln es un salt de linea
             //li estic dient que m'ha de retornar un in o depen
        } else {
            importfinal = preufigura*0.10;
            scanner.nextLine();
            System.out.println("Aplicat l'import per mal estat. L'import final=" + importfinal);



        }

        scanner.close();
    }
}
