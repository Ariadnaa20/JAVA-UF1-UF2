package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class FOR {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;
        System.out.println("Siusplau, introdueix un numero");
        num=input.nextInt();

        for (int i =num; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }
}
