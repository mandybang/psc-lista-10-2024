public class GuardaChuva {
    private String tamanho;
    private String cor;
    private String material;

    public GuardaChuva(String tamanho, String cor, String material) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void abrir() {
        System.out.println("Abrindo o guarda-chuva...");
    }

    public void fechar() {
        System.out.println("Fechando o guarda-chuva...");
    }

    public void protegerChuva() {
        System.out.println("Protegendo da chuva com o guarda-chuva...");
    }
}
