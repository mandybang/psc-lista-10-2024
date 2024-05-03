public class Caneta {
    // Atributos
    private String corTinta;
    private String tipoPonta;
    private String materialCorpo;

    // Construtor
    public Caneta(String corTinta, String tipoPonta, String materialCorpo) {
        this.corTinta = corTinta;
        this.tipoPonta = tipoPonta;
        this.materialCorpo = materialCorpo;
    }

    public String getCorTinta(){
        return corTinta;
    }
    public void setCorTinda(String corTinta){
        this.corTinta = corTinta;
    }
    public String getTipoPonta(){
        return tipoPonta;
    }
    public void setTipoPonta(String tipoPonta){
        this.tipoPonta = tipoPonta;
    }
    public String getMaterialCorpo(){
        return materialCorpo;
    }
    public void setMaterialCorpo(String materialCorpo){
        this.materialCorpo = materialCorpo;
    }
 
    public void escrever() {
        System.out.println("Alguém usou a caneta para escrever");
    }

    public void desenhar() {
        System.out.println("Foi desenhado uma estrela com a caneta");
    }

    public void apagar() {
        System.out.println("Passaram corretivo onde foi usado a caneta");
    }
}