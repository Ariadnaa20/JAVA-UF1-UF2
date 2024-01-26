package ARRAYS;

public class nada {
    public static void main(String[] args) {

        // 2D
        int[][] numeros = {{
                6, 7, 4, 3, 2,
                8, 2, 8, 1, 0,
                1, 6, 2, 5, 6,
                7, 1, 6, 7, 2,
        }};


        // saber la longitud i numero filas i columnas
        int longitud = numeros.length;
        System.out.println(longitud);
        int longitudcolum = numeros[0].length;
        System.out.println(longitudcolum);


        // imprimir la array
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);

            }


            //int[] arrayplenaa= new int[35];  // estatica
            //int[] arraybuida; //inicialitzar


        }
    }
}

