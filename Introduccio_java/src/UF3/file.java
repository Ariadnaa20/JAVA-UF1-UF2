package UF3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            System.out.println("Benvingut");
            File file= new File("C:\\IntelliJ\\ejercicios MO3 Programacion\\Introduccio_java\\Introduccio_java\\src\\UF3\\FILE\\numbers.txt");
            Scanner input = new Scanner(file);

            while (input.hasNextInt()){
                int value = input.nextInt();
                System.out.println("Valor: "+value);
            }

            while(input.hasNext()){
                String Paraula = input.next();
                System.out.println("Value: " + Paraula);
            }
            input.close();


        } catch (FileNotFoundException RegistroError){
            System.out.println(" Que burru ");

        } finally {
            System.out.println("Adeu que vagi be ");

        }


    }
}
