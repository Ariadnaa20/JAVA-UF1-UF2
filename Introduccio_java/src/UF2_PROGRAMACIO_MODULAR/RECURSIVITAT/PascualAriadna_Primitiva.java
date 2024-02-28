package UF2_PROGRAMACIO_MODULAR.RECURSIVITAT;

import java.util.*;

public class PascualAriadna_Primitiva {
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcio;
        int[] aposta = null;
        int[] combinacioGuanyadora = null;
        int premi = 0;

        do {
            System.out.println("***** PRIMITIVA ******");
            System.out.println("1. Fer Aposta");
            System.out.println("2. Girar el bombo");
            System.out.println("3. Joc Nou");
            System.out.println("4. Sortir");
            System.out.print("Tria una opció: ");
            opcio = llegirInt("Selecciona una opció (1-4): ", 1, 4);

            switch (opcio) {
                case 1:
                    aposta = introduirAposta();
                    break;
                case 2:
                    if (aposta == null) {
                        System.out.println("Primer has de fer una aposta.");
                    } else {
                        combinacioGuanyadora = calcularCombinacioGuanyadora();
                        System.out.println("La combinació guanyadora és: " + Arrays.toString(combinacioGuanyadora));
                    }
                    break;
                case 3:
                    if (combinacioGuanyadora != null) {
                        premi = comprovarEncerts(aposta, combinacioGuanyadora);
                        System.out.println("El teu premi és: " + premi + " €");
                        // Reiniciar valors per al joc nou
                        aposta = null;
                        combinacioGuanyadora = null;
                        premi = 0;
                    } else {
                        System.out.println("Has de girar el bombo abans de comprovar els encerts.");
                    }
                    break;
                case 4:
                    System.out.println("Gràcies per jugar a la Primitiva.");
                    break;
            }
        } while (opcio != 4);

        scanner.close();
    }

    private static int[] introduirAposta() {
        Scanner scanner = new Scanner(System.in);
        int[] aposta = new int[6];
        for (int i = 0; i < aposta.length; i++) {
            aposta[i] = llegirInt("Introdueix el número " + (i + 1) + " de l'aposta (1-49): ", 1, 49);
            // Comprovem que el número no s'hagi introduït abans
            for (int j = 0; j < i; j++) {
                if (aposta[j] == aposta[i]) {
                    System.out.println("Aquest número ja ha estat introduït. Torna-ho a provar.");
                    i--; // Disminuïm i per repetir aquesta posició
                    break;
                }
            }
        }
        return aposta;
    }

    private static int[] calcularCombinacioGuanyadora() {
        Random rand = new Random();
        Set<Integer> combinacioSet = new LinkedHashSet<>();
        while (combinacioSet.size() < 6) {
            combinacioSet.add(rand.nextInt(49) + 1);
        }
        int[] combinacio = combinacioSet.stream().mapToInt(Number::intValue).toArray();
        combinacio = Arrays.copyOf(combinacio, 7); // Afegim espai per al número de reintegrament
        combinacio[6] = rand.nextInt(10); // Afegim el número de reintegrament
        return combinacio;
    }


    private static int comprovarEncerts(int[] aposta, int[] combinacioGuanyadora) {
        int premi = 0;
        // Comprovem els encerts dels números
        for (int numAposta : aposta) {
            for (int numGuanyador : Arrays.copyOf(combinacioGuanyadora, 6)) { // Ignorem el reintegrament
                if (numAposta == numGuanyador) {
                    premi += 20; // Sumem 20 per cada encert
                    break;
                }
            }
        }
        // Comprovem el reintegrament
        if (aposta[aposta.length - 1] == combinacioGuanyadora[6]) {
            premi += 6; // Reintegrament de l'aposta
        }
        return premi;
    }

    private static int llegirInt(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }

    private static float llegirFloat(String missatge){
        Scanner llegir = new Scanner(System.in);
        float x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no float.");
            }else{
                x = llegir.nextFloat();
            }
            llegir.nextLine();
        }while(!valorCorrecte);

        return x;
    }
}
