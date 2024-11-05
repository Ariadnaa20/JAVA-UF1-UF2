package UF5.EXC_ESTUDIANT_ARIADNAPASCUAL;

public class Estudiant {
    private String id;
    private String nom;
    private int edat;
    private String curs;
    private boolean matriculat;

    // Constructor
    public Estudiant(String id, String nom, int edat, String curs, boolean matriculat) {
        this.id = id;
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
        this.matriculat = matriculat;
    }

    // els get
    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public String getCurs() {
        return curs;
    }

    public boolean isMatriculat() {
        return matriculat;
    }

    // imprimim info del estudiant
    @Override
    public String toString() {
        return "Estudiant{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", edat=" + edat +
                ", curs='" + curs + '\'' +
                ", matriculat=" + (matriculat ? "Sí" : "No") +
                '}';
    }
}
