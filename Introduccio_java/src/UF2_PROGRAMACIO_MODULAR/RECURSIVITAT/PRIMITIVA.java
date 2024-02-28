package UF2_PROGRAMACIO_MODULAR.RECURSIVITAT;

import java.util.*;

public class PRIMITIVA {

    /**
     * Programa de simulació de La Primitiva
     * @auhor //TODO: Nom Alumne
     * @version 1.0
     * @date //TODO: data
     */
//TODO: Fer refractor per canviar el nom de la classe
    public class CognomNom_Primitiva {
        /**
         * Mètode main executable
         * @param args
         * @since 1.0
         */
        public static void main(String[] args) {
            menuPrincipal();
        }

        /**
         * //TODO: Completar
         * @since 1.0
         */
        private static void menuPrincipal(){
            System.out.println("***** PRIMITIVA ******");

            int[] aposta = introduirAposta();
            int[] combinacioGuanyadora = calcularCombinacioGuanyadora();
            int premi;

            if (combinacioGuanyadora != null) {
                System.out.println("La combinació ganadora és: ");

                for (int i = 0; i < combinacioGuanyadora.length - 1; i++) {
                    System.out.print(combinacioGuanyadora[i] + " ");
                }

                System.out.println("Reintegrament " + combinacioGuanyadora[combinacioGuanyadora.length - 1]);
            }

            premi = comprovarEncerts(aposta, combinacioGuanyadora);
            System.out.println("El teu premi és: "+premi+" €");
        }

        /**
         * //TODO: Completasr
         * @return //TODO: Completar
         * @since 1.0
         */
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


        /**
         * //TODO: Completar
         * @return //TODO: Completar
         * @since 1.0
         */

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



        /**
         * //TODO: Completar
         * @param aposta //TODO: Completar
         * @param combinacioGuanyadora //TODO: Completar
         * @return //TODO: Completar
         * @since 1.0
         */
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


        /**
         * Aquest mètode llegeix un enter per teclat dins d'un domini determinat
         * @param missatge parametritzat per a mostrar a l'usuari@
         * @param min valor min acceptat
         * @param max valor max acceptat
         * @return retorna un int
         * @since 1.0
         */
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

        /**
         * Aquest mètode serveix per capturar floats des de teclat amb control d'errors
         * @param missatge
         * @return
         * @since 1.0
         */
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

}
