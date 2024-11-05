package UF3.Examenuf3.uf4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La classe GestorProductes proporciona mètodes per gestionar la càrrega i el guardat de productes en fitxers de text i binaris.
 */
public class GestorProductes {

    /**
     * Guarda una llista de productes en un fitxer de text.
     *
     * @param productes Llista de productes a guardar.
     */
    public static void guardarProductesText(List<Producte> productes) {
        try (FileOutputStream fos = new FileOutputStream("productes.txt")) {
            for (Producte producte : productes) {
                String line = producte.getNom() + ";" + producte.getQuantitatAnual() + ";" + producte.getCostUnitari() + "\n";
                fos.write(line.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carrega una llista de productes des d'un fitxer de text.
     *
     * @return Llista de productes carregada des del fitxer de text.
     */
    public static List<Producte> carregarProductesText() {
        List<Producte> productes = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("productes.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                String nom = parts[0];
                int quantitatAnual = Integer.parseInt(parts[1]);
                double costUnitari = Double.parseDouble(parts[2]);
                productes.add(new Producte(nom, quantitatAnual, costUnitari));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productes;
    }

    /**
     * Guarda una llista de productes en un fitxer binari.
     *
     * @param productes Llista de productes a guardar.
     */
    public static void guardarProductesBinary(List<Producte> productes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productes.bin"))) {
            oos.writeObject(productes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carrega una llista de productes des d'un fitxer binari.
     *
     * @return Llista de productes carregada des del fitxer binari.
     */
    public static List<Producte> carregarProductesBinary() {
        List<Producte> productes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("productes.bin"))) {
            productes = (List<Producte>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productes;
    }
}
