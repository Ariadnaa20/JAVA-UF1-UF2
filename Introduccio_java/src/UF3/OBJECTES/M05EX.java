package UF3.OBJECTES;

public class M05EX {
    // Definició de la classe Cotxe
    public class Cotxe {
        // Atributs de la classe Cotxe
        private Motor motor;
        private Rodes[] rodes;
        private int numPortes;
        private boolean esElectric;
        private int velocitat;

        // Constructor de la classe Cotxe
        public Cotxe(Motor motor, Rodes[] rodes, int numPortes, boolean esElectric, int velocitat) {
            this.motor = motor;
            this.rodes = rodes;
            this.numPortes = numPortes;
            this.esElectric = esElectric;
            this.velocitat = velocitat;
        }

        // Mètode per frenar el cotxe
        public void frenar() {
            // Implementació de frenar
        }

        // Mètode per accelerar el cotxe
        public void accelerar() {
            // Implementació de accelerar
        }
    }

    // Definició de la classe Motor
    public class Motor {
        // Atributs de la classe Motor
        private String model;
        private int cavalls;
        private int numCilindres;

        // Constructor de la classe Motor
        public Motor(String model, int cavalls, int numCilindres) {
            this.model = model;
            this.cavalls = cavalls;
            this.numCilindres = numCilindres;
        }
    }

    // Definició de la classe Rodes
    public class Rodes {
        // Atributs de la classe Rodes
        private String model;
        private int pressio;
        private int diametre;

        // Constructor de la classe Rodes
        public Rodes(String model, int pressio, int diametre) {
            this.model = model;
            this.pressio = pressio;
            this.diametre = diametre;
        }
    }

    // Comentaris sobre les relacions entre les classes:

    // Entre la classe Cotxe i la classe Motor:
    // Relació de composició.
    // La classe Cotxe conté un objecte de la classe Motor. Això implica que un objecte de Motor està fortament lligat a un objecte de Cotxe i no pot existir independentment d'ell.
    // La relació de composició es representa mitjançant una línia sòlida amb un rombe ple a l'extrem de la classe Cotxe.

    // Entre la classe Cotxe i la classe Rodes:
    // Relació d'agregació.
    // La classe Cotxe conté un o diversos objectes de la classe Rodes. Això implica que un objecte de Cotxe pot tenir associades diverses instàncies de Rodes, però les instàncies de Rodes poden existir independentment de Cotxe.
    // La relació d'agregació es representa mitjançant una línia sòlida amb un rombe buit a l'extrem de la classe Cotxe.

    // Entre la classe Rodes i la classe Cotxe:
    // Relació de dependència.
    // La classe Rodes depèn de la classe Cotxe, ja que s'utilitza a la classe Cotxe com a part del seu estat.
    // La relació de dependència es representa mitjançant una línia puntejada que apunta des de Rodes cap a Cotxe.
}

