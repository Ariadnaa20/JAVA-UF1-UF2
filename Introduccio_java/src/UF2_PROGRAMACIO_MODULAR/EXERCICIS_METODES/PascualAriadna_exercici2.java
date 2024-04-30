package UF2_PROGRAMACIO_MODULAR.EXERCICIS_METODES;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sistema de gestió de reserves i alumnes d'una autoescola.
 * Permet afegir alumnes i reserves d'exàmens, gestionant tot a través d'un menú principal.
 */
public class PascualAriadna_exercici2 {
    static final int MAX_ALUMNES = 100; // Límit d'alumnes que l'aplicació pot gestionar
    static final int MAX_RESERVES = 100; // Límit de reserves que l'aplicació pot gestionar

    static ArrayList<String> alumnes = new ArrayList<>(); // Llista per guardar alumnes
    static ArrayList<String> reserves = new ArrayList<>(); // Llista per guardar reserves

    /**
     * Punt d'entrada principal del programa.
     * Crida al mètode que mostra el menú principal.
     */
    public static void main(String[] args) {
        menuPrincipal();
    }

    /**
     * Mostra el menú principal i gestiona les opcions seleccionades per l'usuari.
     * Implementa la recursivitat per tornar al menú després de cada acció.
     */
    private static void menuPrincipal() { //menu principal recursiu
        System.out.println("\nMenú Principal:");
        System.out.println("1. Donar d'alta un nou alumne");
        System.out.println("2. Donar d'alta una nova reserva d'examen");
        System.out.println("3. Sortir");

        int opcio = llegirInt("Trieu una opció:", 1, 3); // Demana a l'usuari triar una opció

        switch (opcio) {
            case 1:
                altaAlumne();
                break;
            case 2:
                altaReserva();
                break;
            case 3:
                System.out.println("Sortint...");
                return; // Finalitza CAS BASE
            default:
                System.out.println("Opció no vàlida.");
        }
        menuPrincipal(); // Torna a mostrar el menú principal
    }

    /**
     * Permet afegir un nou alumne a la llista.
     * Demana a l'usuari el número d'alumne i el número de reserva, si existeix.
     * He decidit pero no ho demanaves que verifiquem si el número de reserva existeix abans d'afegir l'alumne.
     */
    private static void altaAlumne() {

        if (alumnes.size() >= MAX_ALUMNES) {
            System.out.println("No es poden registrar més alumnes. S'ha assolit el límit màxim.");
            return;
        }
        int numAlumne = llegirInt("Introduïu el número d'alumne:", Integer.MIN_VALUE, Integer.MAX_VALUE); // Demana el número d'alumne
        int numReserva = llegirInt("Introduïu el número de reserva (0 si no té):", 0, Integer.MAX_VALUE); // Demana el número de reserva

        // Comprova si el número d'alumne ja existeix
        boolean existeixAlumne = false;
        for (int i = 0; i < alumnes.size(); i++) {
            if (alumnes.get(i).startsWith(numAlumne + ",")) {
                existeixAlumne = true;
                break;
            }
        }
        if (existeixAlumne) {
            System.out.println("Número d'alumne ja registrat. Si us plau, introduïu un número diferent.");
            return; // Sortim del mètode sense afegir l'alumne
        }

        String reservaStr;
        if (numReserva == 0) {
            reservaStr = "0";
        } else {
            reservaStr = String.valueOf(numReserva);
        }

        // Comprova si la reserva existeix (si no és 0)
        boolean reservaExisteix = false;
        if (!reservaStr.equals("0")) {
            for (int i = 0; i < reserves.size(); i++) {
                if (reserves.get(i).startsWith(reservaStr + ",")) {
                    reservaExisteix = true;
                    break;
                }
            }
        }

        if (!reservaExisteix && !reservaStr.equals("0")) {
            System.out.println("Número de reserva no existeix. Si us plau, crea la reserva primer.");
        } else {
            alumnes.add(numAlumne + "," + reservaStr); // Afegeix l'alumne a la llista
            System.out.println("Alumne afegit amb èxit.");
        }
    }


    /**
     * Permet afegir una nova reserva a la llista.
     * Demana a l'usuari el número de reserva i la data de reserva.
     */
    private static void altaReserva() {
        // Primer comprovem si ja hem assolit el límit de reserves
        if (reserves.size() >= MAX_RESERVES) {
            System.out.println("No es poden crear més reserves. S'ha assolit el límit màxim.");
            return;
        }
        int numReserva = llegirInt("Introduïu el número de reserva:", Integer.MIN_VALUE, Integer.MAX_VALUE); // Demana el número de reserva
        System.out.print("Introduïu la data de reserva (YYYYMMDD): ");
        String dataReserva = new Scanner(System.in).nextLine(); // Crea un nou Scanner per llegir la data
        reserves.add(numReserva + "," + dataReserva); // Afegeix la reserva a la llista
        System.out.println("Reserva afegida amb èxit.");
    }

    /**
     * Llegeix un enter des de l'entrada estàndard, assegurant-se que està dins d'un rang específic.
     * Mostra un missatge d'error si l'entrada no és un enter o està fora del rang.
     *
     * @param missatge El missatge a mostrar a l'usuari per demanar l'entrada.
     * @param min El valor mínim acceptat (inclòs).
     * @param max El valor màxim acceptat (inclòs).
     * @return El valor enter llegit que compleix amb els criteris especificats.
     */
    private static int llegirInt(String missatge, int min, int max) { //control d'errors de forma modular
        Scanner scannerLocal = new Scanner(System.in); // Crea un nou Scanner per a cada crida
        int x = 0;
        boolean valorCorrecte = false;
        do {
            System.out.println(missatge);
            if (!scannerLocal.hasNextInt()) {
                System.out.println("ERROR: Valor no enter."); // Comprova si el valor és un enter
                scannerLocal.next(); //next
            } else {
                x = scannerLocal.nextInt();
                scannerLocal.nextLine(); //nextline
                if (x < min || x > max) {
                    System.out.println("Opció no vàlida"); // Comprova si el valor està dins del rang
                    valorCorrecte = false;
                } else {
                    valorCorrecte = true;
                }
            }
        } while (!valorCorrecte);
        return x;
    }
}

