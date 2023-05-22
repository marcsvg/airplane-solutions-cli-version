package sptech.airplane.solutions.cli.version.application;


import sptech.airplane.solutions.cli.version.model.Totem;
import sptech.airplane.solutions.cli.version.service.Menu;
import sptech.airplane.solutions.cli.version.service.ValidacaoTotem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ValidacaoTotem validacao = new ValidacaoTotem();

        Scanner inputLogin = new Scanner(System.in);
        Scanner inputMain = new Scanner(System.in);

        System.out.println("Bem vindo ao Capture Tool da Airplane Solutions!");
        System.out.println("\nDeseja entrar na aplicação ? (s/n)");

        String login = inputLogin.nextLine();

        do {
            if (login.equalsIgnoreCase("s")) {
                System.out.println("\nInsira o token do totem que quer iniciar a monitorar (Insira 'q' para sair): ");
                String tokenDigitado = inputMain.nextLine();

                if (tokenDigitado.equalsIgnoreCase("q")) {
                    break;
                } else {
                    Totem totemValidado = validacao.validarTotem(tokenDigitado);

                    if (totemValidado != null) {
                        System.out.println("\nTotem encontrado: \n" +
                                        totemValidado);
                        menu.startMenu(totemValidado);
                    } else {
                        System.out.println("Totem inválido");
                        System.out.println("Deseja continuar ? (s/n)");
                    }
                }
            }
        } while (!login.equalsIgnoreCase("q"));

        System.out.println("\nAté logo :D");

    }
}
