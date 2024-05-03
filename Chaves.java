public class Chaves {
    // Atributos
    private String tamanho;
    private String formato;
    private String material;

    // Construtor
    public Chaves(String tamanho, String formato, String material) {
        this.tamanho = tamanho;
        this.formato = formato;
        this.material = material;
    }


    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }


    public void abrirFechaduras() {
        System.out.println("Chave mestra abriu portas.");
    }
  
    public void girar() {
        System.out.println("Girar chave para destrancar portas.");
    }
}