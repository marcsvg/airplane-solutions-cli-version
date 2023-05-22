package sptech.airplane.solutions.cli.version.controller;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.util.Conversor;
import org.springframework.jdbc.core.JdbcTemplate;
import sptech.airplane.solutions.cli.version.dao.Conexao;
import sptech.airplane.solutions.cli.version.model.ComponenteDisco;
import sptech.airplane.solutions.cli.version.model.Totem;

import java.util.Date;

public class ComponenteController {
    Conexao conAzure = new Conexao("sql");
    Conexao conLocal = new Conexao("mysql");
    JdbcTemplate cursorAzure = conAzure.getConnection();
    JdbcTemplate cursorLocal = conLocal.getConnection();
    Looca looca = new Looca();
    public void captureDataAllComponents(Totem totem) {
        captureDataCpu(totem);
        captureDataRam(totem);
        captureDataDisco(totem);
    }

    public void captureDataCpu(Totem totem) {
        Integer fkComponente = 3;
        Integer clock = looca.getProcessador().getNumeroCpusFisicas() + looca.getProcessador().getNumeroCpusLogicas();
        Double clockOnDouble = clock.doubleValue();

        Long tempoDeAtividade = looca.getSistema().getTempoDeAtividade();

        cursorLocal.update("INSERT INTO registroComponente(" +
                        "fkTotem, fkComponente, fkCompanhia, valorUso, clock, dataHoraCaptura, " +
                        "tempoAtividade, dataInicializacao)" +
                        " VALUES (?,?,?,?,?,?,?,?)",
                totem.getIdTotem(),
                fkComponente,
                totem.getFkCompanhia(),
                looca.getProcessador().getUso().intValue(),
                clockOnDouble,
                new Date(),
                Conversor.formatarSegundosDecorridos(tempoDeAtividade),
                Date.from(looca.getSistema().getInicializado())
        );
    }

    public void captureDataRam(Totem totem) {
        Integer fkComponente = 1;
        Long usoRam = looca.getMemoria().getEmUso();

        cursorLocal.update("INSERT INTO registroComponente(" +
                        "fkTotem, fkComponente, fkCompanhia, valorUso, dataHoraCaptura)" +
                        "VALUES (?,?,?,?,?)",
                totem.getIdTotem(), fkComponente, totem.getFkCompanhia(), usoRam, new Date()
        );
    }

    public void captureDataDisco(Totem totem) {
        Integer fkComponente = 2;
        ComponenteDisco disco = new ComponenteDisco();

        Double usoDisco = disco.getUsoDisco();
        Long tempoTransferencia = disco.getTempoTransferencia();

        cursorLocal.update("INSERT INTO registroComponente(" +
                "fkTotem, fkComponente, fkCompanhia, valorUso, tempoTransferencia, dataHoraCaptura) " +
                "VALUES (?,?,?,?,?,?)",
                totem.getIdTotem(), fkComponente, totem.getFkCompanhia(), usoDisco, tempoTransferencia, new Date()
        );
    }
}
