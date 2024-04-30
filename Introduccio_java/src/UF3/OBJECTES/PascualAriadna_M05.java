package UF3.OBJECTES;

/*T'ho poso tot a una clase per no enviar-t'ho totes obviament se q van per separat*/

public class PascualAriadna_M05 {
    // Enum per al tipus d'habilitat
    public enum TipusHabilitat {
        MAGIC,
        PHYSICAL
    }
    // Enum per al rang d'habilitat
    public enum RangHabilitat {
        CAC,
        MIG,
        LLARG
    }

    // Classe Character (Personatge)
    public class Character {
        protected String nom;
        protected int nivell;

        public Character(String nom, int nivell) {
            this.nom = nom;
            this.nivell = nivell;
        }
    }

    // Classe Fighter (Lluitador) que hereta de Character
    public class Fighter extends Character {
        public Fighter(String nom, int nivell) {
            super(nom, nivell);
        }

        public void lluitar() {
            // Implementació de la lògica de lluita per a Lluitador
        }
    }

    // Classe NPC (Personatge No Jugable) que hereta de Character
    public class NPC extends Character {
        public NPC(String nom, int nivell) {
            super(nom, nivell);
        }
    }

    // Classe Skill (Habilitat)
    public class Skill {
        private int dany;
        private TipusHabilitat tipus;
        private RangHabilitat rang;

        public Skill(int dany, TipusHabilitat tipus, RangHabilitat rang) {
            this.dany = dany;
            this.tipus = tipus;
            this.rang = rang;
        }
    }

    // Classe Player (Jugador) que hereta de Character
    public class Player extends Character {
        private Skill[] habilidades; // Aquí és Skill, no Habilidad

        public Player(String nom, int nivell, Skill[] habilidades) { // Aquí és Skill, no Habilidad
            super(nom, nivell);
            this.habilidades = habilidades;
        }

        public void lluitar() {
            // Implementació de la lògica de lluita per al Jugador
        }
    }

    // Classe principal (Main)
    public class Main {
        public static void main(String[] args) {
            // Aquí pots crear instàncies de les teves classes i realitzar les proves que necessitis.
        }
    }



}
