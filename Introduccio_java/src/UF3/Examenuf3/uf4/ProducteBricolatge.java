package UF3.Examenuf3.uf4;

public class ProducteBricolatge extends Producte {
    private boolean dretsExclusius;
    private double costExplotacio;

    public ProducteBricolatge(String nom, int quantitatAnual, double costUnitari, boolean dretsExclusius, double costExplotacio) {
        super(nom, quantitatAnual, costUnitari);
        this.dretsExclusius = dretsExclusius;
        this.costExplotacio = costExplotacio;
    }

    @Override
    protected double calcularPreuExplotacio() {
        if (dretsExclusius && getQuantitatAnual() != 0) {
            return costExplotacio / getQuantitatAnual();
        } else {
            return 0;
        }
    }
}