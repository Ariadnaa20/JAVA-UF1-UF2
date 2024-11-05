package UF5.EXC_ESTUDIANT_ARIADNAPASCUAL;

import java.util.Enumeration;
import java.util.Hashtable;

public class SistemaRegistreEstudiants {
    private Hashtable<String, Estudiant> estudiants;


    public SistemaRegistreEstudiants() {
        estudiants = new Hashtable<>();
    }


    public void afegirEstudiant(Estudiant estudiant) {
        estudiants.put(estudiant.getId(), estudiant); //afegim segons la id i el nom
        System.out.println("Estudiant afegit: " + estudiant);
    }


    public void eliminarEstudiant(String id) {
        if (estudiants.containsKey(id)) {
            estudiants.remove(id);
            System.out.println("Estudiant amb ID " + id + " eliminat.");
        } else {
            System.out.println("Estudiant amb ID " + id + " no trobat.");
        }
    }


    public Estudiant consultarEstudiant(String id) { //consulta el estudiant segons la id
        Estudiant estudiant = estudiants.get(id);
        if (estudiant == null) {
            System.out.println("Estudiant amb ID " + id + " no trobat.");
            return null;
        } else {
            return estudiant;
        }
    }


    public void llistarEstudiants() {
        Enumeration<Estudiant> elements = estudiants.elements();
        if (estudiants.isEmpty()) {
            System.out.println("No hi ha estudiants registrats.");
        } else {
            System.out.println("Llistat d'estudiants:");
            while (elements.hasMoreElements()) {
                System.out.println(elements.nextElement());
            }
        }
    }


    public void llistarEstudiantsMatriculats() { //imprimim els estudiants
        Enumeration<Estudiant> elements = estudiants.elements();
        System.out.println("Estudiants matriculats:");
        boolean found = false;
        while (elements.hasMoreElements()) {
            Estudiant e = elements.nextElement();
            if (e.isMatriculat()) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No hi ha estudiants matriculats.");
        }
    }
}
