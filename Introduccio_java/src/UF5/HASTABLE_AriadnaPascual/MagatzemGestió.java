package UF5.HASTABLE_AriadnaPascual;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Classe per gestionar els productes d'un magatzem utilitzant una Hashtable.
 * Proporciona funcionalitats per afegir, eliminar, consultar, llistar productes,
 * i actualitzar la quantitat en estoc.
 */

public class MagatzemGestió {
    private static Hashtable<String, Producte> productes = new Hashtable<>();
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Mètode principal que mostra el menú d'opcions i permet a l'usuari gestionar
     * els productes del magatzem.
     *
     * @param args Arguments de línia de comandaments (no utilitzats)
     */
    public static void main(String[] args) {
        int opcio;
        do {
            System.out.println("\n--- Menú de Gestió de Productes ---");
            System.out.println("1. Afegir Producte");
            System.out.println("2. Eliminar Producte");
            System.out.println("3. Consultar Producte");
            System.out.println("4. Llistar Productes");
            System.out.println("5. Actualitzar Quantitat en Estoc");
            System.out.println("0. Sortir");
            System.out.print("Selecciona una opció: ");
            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    afegirProducte();
                    break;
                case 2:
                    eliminarProducte();
                    break;
                case 3:
                    consultarProducte();
                    break;
                case 4:
                    llistarProductes();
                    break;
                case 5:
                    actualitzarQuantitat();
                    break;
                case 0:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Intenta-ho de nou.");
            }
        } while (opcio != 0);
    }

    /**
     * Afegeix un nou producte a la Hashtable si el nom no existeix prèviament.
     */
    private static void afegirProducte() {
        System.out.print("Introdueix el nom del producte: ");
        String nom = scanner.nextLine();
        if (productes.containsKey(nom)) {
            System.out.println("Aquest producte ja existeix al magatzem.");
            return;
        }

        System.out.print("Introdueix el preu del producte: ");
        double preu = scanner.nextDouble();
        System.out.print("Introdueix la quantitat en estoc: ");
        int quantitat = scanner.nextInt();
        scanner.nextLine(); // Neteja el buffer

        Producte producte = new Producte(nom, preu, quantitat);
        productes.put(nom, producte);
        System.out.println("Producte afegit amb èxit.");
    }

    /**
     * Elimina un producte de la Hashtable donat el seu nom.
     */
    private static void eliminarProducte() {
        System.out.print("Introdueix el nom del producte a eliminar: ");
        String nom = scanner.nextLine();
        if (productes.remove(nom) != null) {
            System.out.println("Producte eliminat amb èxit.");
        } else {
            System.out.println("No s'ha trobat cap producte amb aquest nom.");
        }
    }

    /**
     * Mostra la informació d'un producte donat el seu nom.
     */
    private static void consultarProducte() {
        System.out.print("Introdueix el nom del producte a consultar: ");
        String nom = scanner.nextLine();
        Producte producte = productes.get(nom);
        if (producte != null) {
            System.out.println(producte);
        } else {
            System.out.println("No s'ha trobat cap producte amb aquest nom.");
        }
    }

    /**
     * Llista tots els productes emmagatzemats a la Hashtable.
     */
    private static void llistarProductes() {
        if (productes.isEmpty()) {
            System.out.println("No hi ha productes al magatzem.");
        } else {
            System.out.println("Productes en el magatzem:");
            for (Producte producte : productes.values()) {
                System.out.println(producte);
            }
        }
    }

    /**
     * Actualitza la quantitat en estoc d'un producte existent.
     */
    private static void actualitzarQuantitat() {
        System.out.print("Introdueix el nom del producte a actualitzar: ");
        String nom = scanner.nextLine();
        Producte producte = productes.get(nom);
        if (producte != null) {
            System.out.print("Introdueix la nova quantitat en estoc: ");
            int novaQuantitat = scanner.nextInt();
            scanner.nextLine();
            producte.setQuantitat(novaQuantitat);
            System.out.println("Quantitat actualitzada amb èxit.");
        } else {
            System.out.println("No s'ha trobat cap producte amb aquest nom.");
        }
    }
}
