package sptech.airplane.solutions.cli.version.application;


import sptech.airplane.solutions.cli.version.controller.TotemController;
import sptech.airplane.solutions.cli.version.model.Totem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TotemController totemCrud = new TotemController();

        System.out.println("Olá, insira o seu token aqui:");
        String tokenDigitado = input.nextLine();

        Totem totemAchado = totemCrud.getTotemByToken(tokenDigitado);

        if (totemAchado != null) {
            System.out.println("Totem achado!");
        } else {
            System.out.println("Totem não encontrado!");
        }
    }
}
