package UF5.QUEUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_AriadnaPascual {
    public static void main(String[] args) {

        Queue<String> cuaImpressio = new LinkedList<>(); // linqued list anem guardant els documents
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introdueix el nombre de documents a afegir a la cua:");
        int numDocuments = scanner.nextInt();
        scanner.nextLine(); //eliminem espai de linea

        for (int i = 1; i <= numDocuments; i++) { //un for q el que fa es anar guardant documents
            System.out.print("Introdueix el nom del document " + i + ": ");
            String document = scanner.nextLine();
            cuaImpressio.add(document);
            //afegeix el document
        }

        System.out.println();


        while (!cuaImpressio.isEmpty()) {

            System.out.println("El següent document a imprimir és: " + cuaImpressio.peek()); // serveix per veure el primer sense eliminarlo


            System.out.println("Imprimint: " + cuaImpressio.poll()); //recupera valor i lo borra
            System.out.println();
        }

        System.out.println("Tots els documents han estat impresos.");

        scanner.close();
    }
}
