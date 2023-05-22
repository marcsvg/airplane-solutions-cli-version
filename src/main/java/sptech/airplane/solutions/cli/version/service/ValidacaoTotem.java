package sptech.airplane.solutions.cli.version.service;

import sptech.airplane.solutions.cli.version.controller.TotemController;
import sptech.airplane.solutions.cli.version.model.Totem;

public class ValidacaoTotem {
    public Totem validarTotem(String token) {
        TotemController totemCrud = new TotemController();

        Totem totemAchado = totemCrud.getTotemByToken(token);

        if (totemAchado != null) {
            return totemAchado;
        } else {
            return null;
        }
    }
}
