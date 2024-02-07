package UF2_PROGRAMACIO_MODULAR.VENDABILLETS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bitllets_PascualAriadna {
    public static void main(String[] args) {  //Main principal on es criden tots els metodes
        Scanner input = new Scanner(System.in);
        System.out.println("Benvingut a la maquina de venda de bitllets");

        /*VARIABLES*/
        List<String> detallesBilletes = new ArrayList<>();
        double precioTotal = 0;
        final int MAX_BILLETES = 3;
        int billetesComprados = 0;

        while (billetesComprados < MAX_BILLETES) {
            int opcioBitllet = MenuTargetes();
            int opcioZones = MenuZones();
            double precio = calcularPrecio(opcioBitllet, opcioZones);
            precioTotal += precio;

            String detalleBillete = String.format("%s zona %d - Preu: %.2f€", obtenirNomBitllet(opcioBitllet), opcioZones, precio);
            detallesBilletes.add(detalleBillete);

            billetesComprados++;


            if (billetesComprados < MAX_BILLETES) {
                System.out.println("Vols comprar un altre bitllet? (s/n)");
                String respuesta = input.next();
                if (!respuesta.equalsIgnoreCase("s")) {
                    break;
                }
            }
        }

        System.out.printf("El preu total a pagar és: %.2f€\n", precioTotal);
        procesarPago(precioTotal);

        System.out.println("Vols el tiquet? (s/n)");
        String quiereTicket = input.next();
        if (quiereTicket.equalsIgnoreCase("s")) {
            imprimirTicket(detallesBilletes);
        }

        System.out.println("Gràcies per la seva compra. Adeu!");
    }


    private static int MenuTargetes() {  /*MENU PRINCIPAL DE LES TARGETES*/
        Scanner opcio = new Scanner(System.in);
        int opcioTargeta = 0;
        do {
            System.out.println("Quin bitllet desitges adquirir? ");
            System.out.println("1-Bitllet sencill");
            System.out.println("2-TCasual");
            System.out.println("3-TUsual");
            System.out.println("4-TFamiliar");
            System.out.println("5-TJove");
            while (!opcio.hasNextInt()) {
                System.out.println("Eso no es un número. Intente de nuevo:");
                opcio.next();
            }

            opcioTargeta = opcio.nextInt();
            if (opcioTargeta < 1 || opcioTargeta > 5) {
                System.out.println("Opció no vàlida. Torni a introduir.");
            }
        } while (opcioTargeta < 1 || opcioTargeta > 5);
        return opcioTargeta;
    }




    private static int MenuZones() {
        Scanner opcio = new Scanner(System.in);
        int opcioZones = 0;
        do {
            System.out.println("Quina zona vol viatjar");
            System.out.println("1- Zona1");
            System.out.println("2- Zona2");
            System.out.println("3- Zona3");
            while (!opcio.hasNextInt()) {
                System.out.println("Eso no es un número. Intente de nuevo:");
                opcio.next();
            }
            opcioZones = opcio.nextInt();
            if (opcioZones < 1 || opcioZones > 3) {
                System.out.println("Opció no vàlida. Torni a introduir.");
            }
        } while (opcioZones < 1 || opcioZones > 3);
        return opcioZones;
    }

    private static void imprimirMissatge(int opcioBitllet, int opcioZones, double precio) {
        String bitllet = obtenirNomBitllet(opcioBitllet);
        String zona = obtenirNomZona(opcioZones);
        System.out.println("Has escollit el bitllet " + bitllet + " i la zona " + zona);
        System.out.println("El preu del bitllet és: " + precio + "€");
    }

    private static void procesarPago(double precio) {
        Scanner input = new Scanner(System.in);
        System.out.printf("El preu del bitllet és: %.2f€. Si us plau, introdueixi el seu pagament.\n", precio);

        double totalIntroducido = 0;
        double cantidad;

        while (totalIntroducido < precio) {
            cantidad = input.nextDouble();
            totalIntroducido += cantidad;

            if (totalIntroducido < precio) {
                System.out.printf("Import insuficient. Encara falta %.2f€.\n", precio - totalIntroducido);
            }
        }

        if (totalIntroducido > precio) {
            double cambio = totalIntroducido - precio;
            System.out.printf("El seu canvi és: %.2f€\n", cambio);
        }

        System.out.println("Gràcies per la seva compra!");
    }

    private static double calcularPrecio(int opcioBitllet, int opcioZones) {  /*CALCULAR EL PREU*/
        double precioBase;

        switch (opcioBitllet) {
            case 1:
                precioBase = 2.40;
                break;
            case 2:
                precioBase = 11.35;
                break;
            case 3:
                precioBase = 40.00;
                break;
            case 4:
                precioBase = 10.00;
                break;
            case 5:
                precioBase = 80.00;
                break;
            default:
                throw new IllegalArgumentException("Tipo de billete no válido.");
        }

        if (opcioZones == 2) {
            precioBase *= 1.3125;
        } else if (opcioZones == 3) {
            precioBase *= 1.8443;
        }

        return precioBase;
    }

    private static String obtenirNomBitllet(int opcioBitllet) {
        return switch (opcioBitllet) {
            case 1 -> "Bitllet Sencill";
            case 2 -> "TCasual";
            case 3 -> "TUsual";
            case 4 -> "TFamiliar";
            case 5 -> "TJove";
            default -> "Desconegut";
        };
    }

    private static String obtenirNomZona(int opcioZones) {
        return switch (opcioZones) {
            case 1 -> "Zona1";
            case 2 -> "Zona2";
            case 3 -> "Zona3";
            default -> "Desconeguda";
        };
    }



    private static void imprimirTicket(List<String> detallesBilletes) {
        System.out.println("------TIQUET------");
        for (String detalle : detallesBilletes) {
            System.out.println(detalle);
        }
        System.out.println("------------------");
        System.out.println("Reculli el teu tiquet.\nAdeu!!");
    }
}



