package UF3.Examenuf3.uf4;
import java.io.Serializable;

public class Producte implements Serializable {
    private static final long serialVersionUID = 1L;

    //atributs de tots els prodytes
    private String nom;
    private int quantitatAnual;
    private double costUnitari;

    // Constructor
    public Producte(String nom, int quantitatAnual, double costUnitari) {
        this.nom = nom;
        this.quantitatAnual = quantitatAnual;
        this.costUnitari = costUnitari;
    }


    public double calcularPreuCost() {
        double preuPromocio = 10;
        double preuProduccio = calcularPreuProduccio();
        double preuExplotacio = calcularPreuExplotacio();

        return preuPromocio + preuProduccio + preuExplotacio;
    }

    protected double calcularPreuProduccio() {
        return costUnitari;
    }

    protected double calcularPreuExplotacio() {
        return 0;
    }

    // Getters y setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatAnual() {
        return quantitatAnual;
    }

    public void setQuantitatAnual(int quantitatAnual) {
        this.quantitatAnual = quantitatAnual;
    }

    public double getCostUnitari() {
        return costUnitari;
    }

    public void setCostUnitari(double costUnitari) {
        this.costUnitari = costUnitari;
    }
}

