package ARRAYS;

import java.util.ArrayList;
import java.util.Scanner;
// + resum examen
public class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //inicialitzar ARRAY DINÀMICA
             //float[] prueba;



        float[] prueba= {7.5f, 5.0f, 8.5f, 6.0f, 4.0f }; // caixa 0, caixa 1, caixa 2, caixa 3, caixa 4
        System.out.println(prueba[1]);

        double[] numeros= {4.0,6.2,3.75,5.1,9.99};
        double s = numeros[0] + numeros[3]; // 4.0 + 5.1 = 9.1

        int[] array= new int[5];
        array[0]++;
        array[0]*=5;  // 0 + 1 = 1 -> 1*5 = 5
        array[1]+=2;



        float[] scores1 = {7.5f,5.0f,8.5f,6.0f,4.0f};
        int longitud = scores1.length; //5. es per a que ens doni la posició total


        //exemple amb if
        float[] scores = {7.5f,5.0f,8.5f,6.0f,4.0f}; //index: 0,1,2,3,4
        int posicion=0;//valor introducido por el usuario

        System.out.println("siusplau, introdueix un nombre de posició ");
        posicion = input.nextInt();

        if ( (posicion>=0) && (posicion<scores.length) ){
            System.out.println(scores[posicion]);
        }else{  // gestionar per si decas el ususari posa una posicio fora del rang
            System.out.println("la posició que has introduït no es vàlida. ");
        }









        // inicalitzar una ARRAY ESTATICA
        float[] prueba2= new float[25]; //25 caixes sense info a dins
        System.out.println(prueba2[1]); // m'imprimira un 0 i si poso index 26 em donara error.





    }
}



// array estatica de boolean sortira tot false
// i si fem una array null sortira null i el mateix amb strings