public class Oculos {
    private String tipoLente;
    private String armacao;
    private String cor;

    public Oculos(String tipoLente, String armacao, String cor) {
        this.tipoLente = tipoLente;
        this.armacao = armacao;
        this.cor = cor;
    }

    public String getTipoLente() {
        return tipoLente;
    }

    public void setTipoLente(String tipoLente) {
        this.tipoLente = tipoLente;
    }

    public String getArmacao() {
        return armacao;
    }

    public void setArmacao(String armacao) {
        this.armacao = armacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ver() {
        System.out.println("Vendo através dos óculos...");
    }

    public void ajustar() {
        System.out.println("Ajustando os óculos...");
    }

    public void limpar() {
        System.out.println("Limpando os óculos...");
    }
}
