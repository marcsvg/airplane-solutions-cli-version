package sptech.airplane.solutions.cli.version;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
        JdbcTemplate con = new Conexao().getConnection();

        List<Totem> queryTeste = con.query("SELECT * FROM totem;", new BeanPropertyRowMapper<Totem>(Totem.class));
        System.out.println(queryTeste);

    }
}
