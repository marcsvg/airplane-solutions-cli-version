package sptech.airplane.solutions.cli.version;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {
    private JdbcTemplate connectionSQL;

    public Conexao() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://airplane-solutions.database.windows.net:1433;"
                + "database=bd-airplane-solutions;encrypt=true;trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;");
        dataSource.setUsername("totemInfo@airplane-solutions");
        dataSource.setPassword("Totem_!nf0");

        this.connectionSQL = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        System.out.println("Procurando dados (SQL)");
        return connectionSQL;
    }
}
