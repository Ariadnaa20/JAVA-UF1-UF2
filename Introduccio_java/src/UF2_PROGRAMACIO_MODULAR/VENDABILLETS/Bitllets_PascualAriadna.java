package UF2_PROGRAMACIO_MODULAR.VENDABILLETS;

import java.util.Scanner;

public class Bitllets_PascualAriadna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Benvingut a la maquina de venda de bitllets");
        MenuTargetes();
        System.out.println("Quina zona vol viatjar");
        MenuZones();

    }


    private static void MenuTargetes(){
        Scanner opcio= new Scanner(System.in);
        int opcioTargeta=0;
            System.out.println("Quin bitllet desitjes adquirir? ");
            System.out.println("1-Bitllet sencill");
            System.out.println("2-TCasual");
            System.out.println("3-TUsual");
            System.out.println("4-TFamiliar");
            System.out.println("5-TJove");
            opcioTargeta= opcio.nextInt();

            do{
                switch (opcioTargeta){
                    case 1 -> BitlletSencill();
                    case 2 -> TCasual();
                    case 3 -> TUsual();
                    case 4 -> TFamiliar();
                    case 5 -> TJove();
                }

            }while(opcioTargeta != 5);
    }


    private static void MenuZones(){
        Scanner opcio= new Scanner(System.in);
        System.out.println("Quina zona vol viatjar");
        int opcioZones=0;
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        opcioZones=opcio.nextInt();


        do{
            switch(opcioZones){
                case 1 -> Zona1();
                case 2 -> Zona2();
                case 3 -> Zona3();
            }

        }while(opcioZones != 5);
    }



    //BITLLETS

    private static void BitlletSencill(){
        System.out.println("Has escollit BitlletSencill");
        MenuZones();

    }

    private static void TCasual(){
        System.out.println("Has escollit TCasual");
        MenuZones();
    }

    private static void TUsual(){
        System.out.println("Has escollit TUsual");
        MenuZones();
    }

    private static void TFamiliar(){
        System.out.println("Has escollit TFamiliar");
        MenuZones();
    }

    private static void TJove(){
        System.out.println("Has escollit TJove ");
        MenuZones();
    }

    //ZONES

    private static void Zona1(){
        System.out.println("Has escollit Zona1");


    }

    private static void Zona2(){
        System.out.println("Has escollit Zona2");

    }

    private static void Zona3(){
        System.out.println("Has escollit Zona3");

    }





}
