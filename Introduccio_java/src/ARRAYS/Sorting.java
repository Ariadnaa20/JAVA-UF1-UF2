package ARRAYS;

public class Sorting {   //BUBBLE SORT
    public static void main(String[] args) { // como ordenar la array
        float[] numeros= {7.5f, 5.0f, 10.0f, 6.0f, 10.0f};
        for(int i=0; i<numeros.length-1; i++){  // el primer cop es o es a dir 7,5
            for (int j= i+1; j< numeros.length; j++){  // j es 5.0
                if (numeros[i]>numeros[j]){  // aqui comparo si i es mes gran de j :
                    float cambio= numeros[i]; //guardo a cambioo el valor de i de scores. es a dir guardo 7,5
                    numeros[i]=numeros[j];   // le asigno el valor de j a la i scores es a dir 5.0.
                    numeros[j]=cambio; // le assigno el valor de cambio a j
                }
            }
        }
        System.out.println("El array ordenado es: ");
        for(int i=0; i< numeros.length; i++){
            System.out.println(numeros[i]+ "");
        }
        System.out.println();
    }
}

// pero si poses Arrays.sort ya te la ordena