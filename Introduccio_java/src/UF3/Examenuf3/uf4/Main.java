package UF3.Examenuf3.uf4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Producte> productes = new ArrayList<>();

    public static void main(String[] args) {
        carregarProductes();
        boolean sortir = false;
        while (!sortir) {
            mostrarMenu();
            int opcio = llegirInt("Escull una opció: ", 1, 3); // Llegir una opció vàlida
            switch (opcio) {
                case 1:
                    afegirProducte();
                    break;
                case 2:
                    mostrarProductes();
                    break;
                case 3:
                    sortir = true;
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        }
        guardarProductes();
        System.out.println("Fins aviat!");
    }

    /**
     * Aquest mètode llegeix un enter per teclat dins d'un domini determinat
     * @param missatge parametritzat per a mostrar a l'usuari
     * @param min valor min acceptat
     * @param max valor max acceptat
     * @return retorna un int
     */
    private static int llegirInt(String missatge, int min, int max) { //metode control d'errors
        int x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.println(missatge);
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                scanner.nextLine();
                if (x < min || x > max) {
                    System.out.println("Opció no vàlida");
                } else {
                    valorCorrecte = true;
                }
            } else {
                System.out.println("ERROR: Valor no enter.");
                scanner.nextLine();
            }
        } while (!valorCorrecte);

        return x;
    }


    // Mostra el menú de opcions
    private static void mostrarMenu() {
        System.out.println("\n----- MENÚ -----");
        System.out.println("1. Afegir producte");
        System.out.println("2. Modificar producte");
        System.out.println("3. Mostrar productes");
        System.out.println("4. Sortir");
        System.out.print("Escull una opció: ");
        scanner.nextLine(); // Consumim la nova línia
    }

    // Afegeix un nou producte a la llista
    private static void afegirProducte() {
        System.out.println("\nAfegir nou producte:");
        System.out.print("Nom del producte: ");
        String nom = scanner.nextLine();
        System.out.print("Quantitat anual: ");
        int quantitatAnual = scanner.nextInt();
        System.out.print("Cost unitari: ");
        double costUnitari = scanner.nextDouble();

        // Creem una nova instància de Producte amb les dades introduïdes
        Producte nouProducte = new Producte(nom, quantitatAnual, costUnitari);

        // Afegim el nou producte a la llista
        productes.add(nouProducte);

        System.out.println("Producte afegit amb èxit!");
    }

    // Modifica un producte existent


    // Mostra tots els productes de la llista
    private static void mostrarProductes() {
        System.out.println("\nLlistat de productes:");
        if (productes.isEmpty()) {
            System.out.println("No hi ha cap producte enregistrat.");
        } else {
            for (int i = 0; i < productes.size(); i++) {
                System.out.println((i + 1) + ". " + productes.get(i).getNom());
            }
        }
    }

    // Carrega els productes des d'un fitxer
    private static void carregarProductes() {
        System.out.println("Carregant productes des de l'arxiu...");
        productes.clear(); // Netegem la llista abans de carregar els productes
        productes.addAll(GestorProductes.carregarProductesText());
        System.out.println("Productes carregats amb èxit!");
    }

    // Guarda els productes en un fitxer
    private static void guardarProductes() {
        System.out.println("Guardant productes a l'arxiu...");
        GestorProductes.guardarProductesText(productes);
        System.out.println("Productes guardats amb èxit!");
    }
}
