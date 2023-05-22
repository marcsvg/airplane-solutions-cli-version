package sptech.airplane.solutions.cli.version.controller;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sptech.airplane.solutions.cli.version.dao.Conexao;
import sptech.airplane.solutions.cli.version.model.Totem;

import java.util.List;

public class TotemController {
    public Totem getTotemByToken(String token) {
        Conexao con = new Conexao("sql");
        JdbcTemplate cursor = con.getConnection();

        List<Totem> totemAchado = cursor.query(
                String.format("SELECT * FROM totem WHERE token LIKE '%s'", token),
                new BeanPropertyRowMapper<>(Totem.class)
        );

        for (Totem totem : totemAchado) {
            return totem;
        }

        return null;
    }
}
