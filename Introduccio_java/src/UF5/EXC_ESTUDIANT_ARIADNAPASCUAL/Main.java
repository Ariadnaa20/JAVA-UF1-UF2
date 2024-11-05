package UF5.EXC_ESTUDIANT_ARIADNAPASCUAL;

public class Main {
    public static void main(String[] args) {
        SistemaRegistreEstudiants registre = new SistemaRegistreEstudiants();

        //en aquesta carpeta trobas la calse Estudiant, on estan els atributs contructior i metodes
        // classe Sistema Registre on guarda, elimina i consukta estudiants segons el ID
        registre.afegirEstudiant(new Estudiant("1", "Anna", 20, "Enginyeria", true));
        registre.afegirEstudiant(new Estudiant("2", "Joan", 22, "Medicina", false));
        registre.afegirEstudiant(new Estudiant("3", "Maria", 19, "Arquitectura", true));


        System.out.println("Tots els estudiants:");
        registre.llistarEstudiants();

        System.out.println("\nConsultar estudiant amb ID 1:");
        System.out.println(registre.consultarEstudiant("1"));


        System.out.println("\nEliminar estudiant amb ID 2:");
        registre.eliminarEstudiant("2");


        System.out.println("\nLlistar estudiants matriculats:");
        registre.llistarEstudiantsMatriculats();
    }
}
