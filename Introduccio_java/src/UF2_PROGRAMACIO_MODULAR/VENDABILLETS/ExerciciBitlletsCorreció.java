package UF2_PROGRAMACIO_MODULAR.VENDABILLETS;

import UF2_PROGRAMACIO_MODULAR.CALCULADORA.Main;

import java.util.Scanner;

public class ExerciciBitlletsCorreció {
    /*Programa de gestió de venta de Billets.
     Metodes propostats:
     SeleccioTipusBitllet();
     SeleccióZonesBitllet();
     Preu Total Bitllets();
       - DemanarDinersAlUsuari();
     CalcularCanvi();
     ImprimirTiquet();


     */
    public static void main(String[] args) {
        ExerciciBitlletsCorreció programa = new ExerciciBitlletsCorreció();
        programa.menuprinipal();
    }

    private void menuprinipal() {
        int opcio=0;
        System.out.println("Benvingut a TMB");
        System.out.println("Escull quin tipus de Bitllet  que vulgui");
        IniciarProcesCompra();
    }

    private static void IniciarProcesCompra(){
        int opcio=0;
        boolean out=false;
        int NumeroBitllet=0;

            do {
                opcio= SeleccioTipusBitllet();
                out=PreguntarSiVolUnAltreBillet(NumeroBitllet);
                if (out == true) {
                    NumeroBitllet++;
                }

            }while(!out && NumeroBitllet < 3);
    }


    private static int SeleccioTipusBitllet() {
        Scanner input = new Scanner(System.in);
        int opcio=0;
        String [] TipusBitllets = {"BSencill", "TCasual", "TUsual", "TJove", "Tfamiliar"};
        for (int i = 0; i<=4; i++){
            System.out.println("Opcio" + (i+1) + ": " + TipusBitllets[i]);
        }
        // Asegurarse de que la opción es válida
        while (opcio < 1 || opcio > TipusBitllets.length) {
            System.out.println("Opció no vàlida, si us plau, tria una opció vàlida.");
            opcio = input.nextInt();
        }

        return opcio;
    }

    private static boolean PreguntarSiVolUnAltreBillet(int NumBillet) {
        Scanner LLegirTeclat= new Scanner (System.in);
        int NumeroBillet=0;
        boolean Comprar = false;
        System.out.println("Vols comprar un altre billet? True/False");
        System.out.println("Avis, nomes pots comprar 3 com a maxim. Aquest es el teu billet numero" + NumBillet);
        Comprar= LLegirTeclat.nextBoolean();
        return Comprar;


    }

    private static int SeleccioZonesBillet(){
        Scanner SeleccioZona = new Scanner(System.in);
        int NumeroZona=0;
        String [] TipusZones = {"Zona1", "Zona2", "Zona3"};
        for (int i = 0; i<=2; i++){
            System.out.println("Opcio" + (i+1) + ": " + TipusZones[i]);
        }
        NumeroZona=SeleccioZona.nextInt();
        while (NumeroZona < 1 || NumeroZona > TipusZones.length) {
            System.out.println("Opció no vàlida, si us plau, tria una opció vàlida.");
            NumeroZona = SeleccioZona.nextInt();
        }
        return NumeroZona;
    }

    private void PreuTotalBillets(){

    }

    private void DemanarDinersAlUsuari(){

    }

    private void CalcularCanvi(){

    }
    private void ImprimirTiquet(){

    }


}
