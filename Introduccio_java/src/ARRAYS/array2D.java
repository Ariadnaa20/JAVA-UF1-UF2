package ARRAYS;

public class array2D {
    public static void main(String[] args) {
        float[][] grades= {       //hem de intentar sempre fer una cuadricula
                {8.7f,9.3f,9.0f,7.5f,6.0f},
                {9.3f,7.0f,9.5f, 7.0f, 8.0f},
                {5.5f,7.5f,8.2f,8.0f,6.6f},
                {9.0f,7.5f,9.0f,8.5f,7.0f}
        };




        //COM ACCEDIM?

        //la i es fila
        // la j es columna   // PRIMER ES FILA I DESPRES TOTES LES COLUMNES DE LA FILA
        for ( int i=0 ; i<grades.length ; i++) {
            for ( int j=0 ; j<grades[i].length ; j++) {
                System.out.println(grades[i][j]);
                //code block
                // will execute as long as loop condition is true
            }
        }





    }
}
