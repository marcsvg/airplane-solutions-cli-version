package sptech.airplane.solutions.cli.version.service;

import sptech.airplane.solutions.cli.version.controller.ComponenteController;
import sptech.airplane.solutions.cli.version.model.Totem;

import java.util.Scanner;

public class Menu {
    public void startMenu(Totem totem) {
        Scanner inputMenu = new Scanner(System.in);
        ComponenteController componenteCrud = new ComponenteController();

        Integer escolhaDigitada;

        do {
            System.out.println("-".repeat(50));
            System.out.println("| 1 - Capturar todos os dados (CPU, Ram e Disco) |");
            System.out.println("| 2 - Capturar dados somente da CPU              |");
            System.out.println("| 3 - Capturar dados somente da Memória ram      |");
            System.out.println("| 4 - Capturar dados somente do Disco            |");
            System.out.println("| 0 - Sair                                       |");
            System.out.println("-".repeat(50));

            escolhaDigitada = inputMenu.nextInt();

            switch (escolhaDigitada) {
                case 1:
                    //Deve cadatrar todos os dados
                    System.out.println("Capturando dados de CPU, Memória RAM e Disco");
                    componenteCrud.captureDataAllComponents(totem);
                    System.out.println("\nCaptura feita");
                    break;
                case 2:
                    //Deve capturar só dados de CPU
                    System.out.println("Capturando dados só de CPU");
                    componenteCrud.captureDataCpu(totem);
                    System.out.println("\nCaptura feita");
                    break;
                case 3:
                    //Deve capturar só dados de RAM
                    System.out.println("Capturando dados só de Memória ram");
                    componenteCrud.captureDataRam(totem);
                    System.out.println("\nCaptura feita");
                    break;
                case 4:
                    //Deve capturar só dados de Disco
                    System.out.println("Capturando dados só de disco");
                    componenteCrud.captureDataDisco(totem);
                    System.out.println("\nCaptura feita");
                    break;
                default:
                    System.out.println("Saindo dá aplicação!");
                    break;
            }
        } while (escolhaDigitada != 0);
    }
}
