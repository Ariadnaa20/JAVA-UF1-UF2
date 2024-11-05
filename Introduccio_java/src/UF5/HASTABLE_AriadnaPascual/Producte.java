package UF5.HASTABLE_AriadnaPascual;

/*Aquesta clase te els atributs
* Nom, Preu i Quantitat
I metodes te:
* els get i set i toString*/

class Producte {
    private String nom;
    private double preu;
    private int quantitat;

    /**
     * Constructor per inicialitzar un producte amb el seu nom, preu i quantitat.
     *
     * @param nom      el nom del producte
     * @param preu     el preu del producte
     * @param quantitat la quantitat en estoc del producte
     */
    public Producte(String nom, double preu, int quantitat) {
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    /**
     * Obté el nom del producte.
     * @return el nom del producte
     */
    public String getNom() {
        return nom;
    }

    /**
     * Obté el preu del producte.
     * @return el preu del producte
     */
    public double getPreu() {
        return preu;
    }

    /**
     * Obté la quantitat en estoc del producte.
     * @return la quantitat en estoc
     */
    public int getQuantitat() {
        return quantitat;
    }

    /**
     * Actualitza la quantitat en estoc del producte.
     * @param quantitat la nova quantitat en estoc
     */
    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    /**
     * Retorna una descripció llegible del producte en format text.
     * @return la descripció del producte
     */
    @Override
    public String toString() {
        return "Producte{" +
                "Nom='" + nom + '\'' +
                ", Preu=" + preu +
                ", Quantitat=" + quantitat +
                '}';
    }
}
