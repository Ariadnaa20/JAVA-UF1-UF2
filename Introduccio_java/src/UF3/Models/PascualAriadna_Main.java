package UF3.Models;

import UF3.Models.PascualAriadna_Character;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PascualAriadna_Main {

    private static ArrayList<PascualAriadna_Character> charactersList = new ArrayList<>();

    public static void main(String[] args) {
        readFile("Introduccio_java/src/UF3/Models/characters-one-piece.csv");
        showMenu();
    }

    private static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Mostrar personajes");
            System.out.println("2. Añadir personaje");
            System.out.println("3. Editar personaje");
            System.out.println("4. Eliminar personaje");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printCharacters();
                    break;
                case 2:
                    addCharacter();
                    break;
                case 3:
                    editCharacter();
                    break;
                case 4:
                    deleteCharacter();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAñadir nuevo personaje:");
        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Capítulo: ");
        int chapter = scanner.nextInt();

        System.out.print("Episodio: ");
        int episode = scanner.nextInt();

        System.out.print("Año: ");
        int year = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nota: ");
        String note = scanner.nextLine();

        PascualAriadna_Character character = new PascualAriadna_Character(name, chapter, episode, year, note);
        charactersList.add(character);
        System.out.println("Personaje añadido correctamente.");
    }

    private static void editCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEditar personaje:");
        System.out.print("Índice del personaje a editar: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < charactersList.size()) {
            PascualAriadna_Character character = charactersList.get(index);
            System.out.println("Editar personaje " + character.getName() + ":");

            System.out.print("Nuevo nombre: ");
            String name = scanner.nextLine();
            character.setName(name);

            System.out.print("Nuevo capítulo: ");
            int chapter = scanner.nextInt();
            character.setChapter(chapter);

            System.out.print("Nuevo episodio: ");
            int episode = scanner.nextInt();
            character.setEpisode(episode);

            System.out.print("Nuevo año: ");
            int year = scanner.nextInt();
            character.setYear(year);

            scanner.nextLine();
            System.out.print("Nueva nota: ");
            String note = scanner.nextLine();
            character.setNote(note);

            System.out.println("Personaje editado correctamente.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    private static void deleteCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEliminar personaje:");
        System.out.print("Índice del personaje a eliminar: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < charactersList.size()) {
            PascualAriadna_Character character = charactersList.remove(index);
            System.out.println("Personaje eliminado: " + character.getName());
        } else {
            System.out.println("Índice no válido.");
        }
    }

    private static void readFile(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("&");

                if (parts.length >= 5) {
                    String name = parts[0];
                    int chapter = Integer.parseInt(parts[1]);
                    int episode = Integer.parseInt(parts[2]);
                    int year = Integer.parseInt(parts[3]);
                    String note = parts[4];

                    PascualAriadna_Character character = new PascualAriadna_Character(name, chapter, episode, year, note);
                    charactersList.add(character);
                } else {
                    System.err.println("Error: La línea no tiene suficientes partes - " + line);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printCharacters() {
        System.out.println("\nLista de personajes:");
        for (int i = 0; i < charactersList.size(); i++) {
            System.out.println(i + ". " + charactersList.get(i));
        }
    }
}
