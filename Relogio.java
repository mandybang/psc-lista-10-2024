public class Relogio {
    private String marca;
    private String tipoExibicao;
    private String materialPulseira;

    public Relogio(String marca, String tipoExibicao, String materialPulseira) {
        this.marca = marca;
        this.tipoExibicao = tipoExibicao;
        this.materialPulseira = materialPulseira;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoExibicao() {
        return tipoExibicao;
    }

    public void setTipoExibicao(String tipoExibicao) {
        this.tipoExibicao = tipoExibicao;
    }

    public String getMaterialPulseira() {
        return materialPulseira;
    }

    public void setMaterialPulseira(String materialPulseira) {
        this.materialPulseira = materialPulseira;
    }

    public void mostrarHora() {
        System.out.println("Mostrando a hora...");
    }

    public void ajustarHorario() {
        System.out.println("Ajustando o horário...");
    }

    public void alarmar() {
        System.out.println("Alarmando...");
    }
}
