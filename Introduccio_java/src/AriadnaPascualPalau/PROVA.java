package AriadnaPascualPalau;

import java.util.Scanner;

public class PROVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombresAlumnos = new String[50];
        double[][] notasAlumnos = new double[50][3];
        int totalAlumnos = 0;

        int opcion;

        do {
            System.out.println("INTRODUEIX LES NOTES DELS TEUS ALUMNES!!! ");
            System.out.println("-------- Menú --------");
            System.out.println("1. Afegir alumne");
            System.out.println("2. Afegeix notes "); /* De quina ssignatura vols*/
            System.out.println("3. Consultar les notas d'un alumne en concret"); /*  MOdifica es opcional menu de 2 opcions*/
            System.out.println("4. Mostrar les notes finals");

            /* 2 asignatures : MO3 I MO4. de cada Asignatura hi han 3 UF1 UF2 UF3    tenim  */

            System.out.println("5. Sortir");
            System.out.print("Si us plau, Francesc, selecciona una opció: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    do {
                        System.out.print("Ingresi el nom del alumne i els cognoms: ");
                        nombresAlumnos[totalAlumnos] = scanner.nextLine();
                        totalAlumnos++;

                        // Pregunta si desea añadir otro alumno
                        System.out.print("¿Vols afegir un altre alumne? (1 per sí, 0 per no): ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion == 1);

                    break;



                case 2:
                    if (totalAlumnos > 0) {
                        System.out.print("Ingresi el nom del alumne per afegir notas: ");
                        String nombreAlumnoNotas = scanner.nextLine();

                        int indiceAlumno = -1;

                        for (int i = 0; i < totalAlumnos; i++) {
                            if (nombreAlumnoNotas.equalsIgnoreCase(nombresAlumnos[i])) {
                                indiceAlumno = i;
                                break;
                            }
                        }

                        if (indiceAlumno != -1) {
                            System.out.print("Ingresi las tres notas de cada UF del alumne (separades per espais): ");
                            String[] notasStr = scanner.nextLine().split(" ");

                            for (int i = 0; i < 3; i++) {
                                notasAlumnos[indiceAlumno][i] = Double.parseDouble(notasStr[i]);
                            }

                            System.out.println("Notas afegides correctament.");
                        } else {
                            System.out.println("Alumne no trobat.");
                        }
                    } else {
                        System.out.println("No hi han alumnes registrats. Si us plau, afegeixi un alumne primer.");
                    }
                    break;

                case 3:
                    if (totalAlumnos > 0) {
                        System.out.print("Ingresi el nom del alumne per consultar la nota: ");
                        String nombreAlumnoConsulta = scanner.nextLine();

                        int indiceAlumnoConsulta = -1;

                        for (int i = 0; i < totalAlumnos; i++) {
                            if (nombreAlumnoConsulta.equalsIgnoreCase(nombresAlumnos[i])) {
                                indiceAlumnoConsulta = i;
                                break;
                            }
                        }

                        if (indiceAlumnoConsulta != -1) {
                            System.out.println("Notas del alumne " + nombresAlumnos[indiceAlumnoConsulta] + ":");
                            for (int i = 0; i < 3; i++) {
                                System.out.println("Nota UF" + (i + 1) + ": " + notasAlumnos[indiceAlumnoConsulta][i]);
                            }
                        } else {
                            System.out.println("Alumne no trobat :(");
                        }
                    } else {
                        System.out.println("No hi han alumnes registrats. Si us plau, afegeix un alumne primer.");
                    }
                    break;

                case 4:
                    if (totalAlumnos > 0) {
                        System.out.println("------ Totes las notas ------");
                        for (int i = 0; i < totalAlumnos; i++) {
                            System.out.println("Alumne: " + nombresAlumnos[i]);
                            for (int j = 0; j < 3; j++) {
                                System.out.println("Nota UF " + (j + 1) + ": " + notasAlumnos[i][j]);
                            }
                            System.out.println("-----------------------------");
                        }
                    } else {
                        System.out.println("No hi han alumnes registrats. Si us plau, afegeix un alumne primer.");
                    }
                    break;

                case 5:
                    System.out.println("Sortint del programa. ¡Fins després!");
                    break;

                default:
                    System.out.println("Opció no vàlida. Si us plau, seleccioni una opció correcta.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}

