package sptech.airplane.solutions.cli.version;

public class Totem {
    private Integer idTotem;
    private String fabricante;
    private String arquitetura;
    private String sistemaOperacional;
    private String processador;
    private String localizacaoTotem;
    private Integer fkCompanhia;
    private String token;

    public Totem(Integer idTotem, String fabricante, String arquitetura, String sistemaOperacional, String processador, String localizacaoTotem, Integer fkCompanhia, String token) {
        this.idTotem = idTotem;
        this.fabricante = fabricante;
        this.arquitetura = arquitetura;
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
        this.localizacaoTotem = localizacaoTotem;
        this.fkCompanhia = fkCompanhia;
        this.token = token;
    }

    public Totem() {
    }

    public Integer getIdTotem() {
        return idTotem;
    }

    public void setIdTotem(Integer idTotem) {
        this.idTotem = idTotem;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getArquitetura() {
        return arquitetura;
    }

    public void setArquitetura(String arquitetura) {
        this.arquitetura = arquitetura;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getLocalizacaoTotem() {
        return localizacaoTotem;
    }

    public void setLocalizacaoTotem(String localizacaoTotem) {
        this.localizacaoTotem = localizacaoTotem;
    }

    public Integer getFkCompanhia() {
        return fkCompanhia;
    }

    public void setFkCompanhia(Integer fkCompanhia) {
        this.fkCompanhia = fkCompanhia;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Totem{" +
                "idTotem=" + idTotem +
                ", fabricante='" + fabricante + '\'' +
                ", arquitetura='" + arquitetura + '\'' +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                ", processador='" + processador + '\'' +
                ", localizacaoTotem='" + localizacaoTotem + '\'' +
                ", fkCompanhia=" + fkCompanhia +
                ", token='" + token + '\'' +
                '}';
    }
}
