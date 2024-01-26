package ExercicisPseudoaJAVA;

import java.util.Scanner;

public class Exercici13correccion {


        public static void main(String[] args) {


                    Scanner scanner = new Scanner(System.in);
                    double moneda=0;
                    double cambio=0;

                    System.out.println("Benvingut a la màquina de cafè de la 4a planta de l'escola.");
                    int opcion;

                    do {
                        System.out.println("Quin producte vol?\n1. Cafè\n2. Tallat\n3. Cafè amb llet\n4. Sortir");
                        opcion = scanner.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Introdueixi una moneda (0.5€ requerits): ");
                                moneda = scanner.nextDouble();

                                if (moneda >= 0.50) {
                                    System.out.println("Preparant el Cafè...");
                                    cambio = moneda - 0.50;
                                    System.out.println("Cafè entregat. Canvi: " + cambio + "€");
                                } else {
                                    System.out.println("Import insuficient. Faltan " + (0.50 - moneda) + "€.");
                                }
                                return;

                            case 2:
                                System.out.println("Introdueixi una moneda (0.5€ requerits): ");
                                moneda = scanner.nextDouble();

                                if (moneda >= 0.50) {
                                    System.out.println("Preparant el Tallat...");
                                    cambio = moneda - 0.50;
                                    System.out.println("Tallat entregat. Canvi: " + cambio + "€");
                                }  else {
                                    System.out.println("Import insuficient. Faltan " + (0.50 - moneda) + "€.");
                                }
                                return;

                            case 3:
                                System.out.println("Introdueixi una moneda (0.5€ requerits): ");
                                moneda = scanner.nextDouble();

                                if (moneda >= 0.50) {
                                    System.out.println("Preparant el Cafè amb llet...");
                                     cambio = moneda - 0.50;
                                    System.out.println("Cafè amb llet entregat. Canvi: " + cambio + "€");
                                } else {
                                    System.out.println("Import insuficient. Faltan " + (0.50 - moneda) + "€.");
                                }
                                return;

                            case 4:
                                System.out.println("Sortint del programa.");
                                return;

                            default:
                                System.out.println("Opció no vàlida. Torni a introduir una opció.");
                                break;
                        }
                    } while (opcion <=0 || opcion >4);
                    System.out.println("Gràcies per utilitzar la màquina de cafè. Fins aviat!");
                }


        }