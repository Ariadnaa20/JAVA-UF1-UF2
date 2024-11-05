package UF3.Examenuf3.uf4;

public class ProducteFitness extends Producte {
    private Patent patent;
    private int quantitatFabricada;

    public ProducteFitness(String nom, int quantitatAnual, double costUnitari, Patent patent, int quantitatFabricada) {
        super(nom, quantitatAnual, costUnitari);
        this.patent = patent;
        this.quantitatFabricada = quantitatFabricada;
    }

    @Override
    protected double calcularPreuProduccio() {
        if (quantitatFabricada != 0) {
            return getCostUnitari() + (patent.getCost() / quantitatFabricada);
        } else {
            return getCostUnitari(); // Retorna solo el coste unitario si la cantidad fabricada es cero
        }
    }

}