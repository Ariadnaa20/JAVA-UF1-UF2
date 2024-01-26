package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class exemple_nestedloops2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;
        int mysteryBoxNumber = 5;
        int count = 3;
        boolean win = false;
        System.out.println("introdueix un num");


        //ho hem de fer amb un while i dins do while diapo28


        while (count > 0 && !win) {
            System.out.println("Please enter a number (1-10)");
            num = input.nextInt();
            input.nextLine();
            count--;
            if (num == mysteryBoxNumber) {
                win = true;
            }
        }
        if (win) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!. The value of the mysterious box is.." + mysteryBoxNumber);


        }
    }
}