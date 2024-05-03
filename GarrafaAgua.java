public class GarrafaAgua {
    private int capacidade;
    private String material;
    private String formato;

    public GarrafaAgua(int capacidade, String material, String formato) {
        this.capacidade = capacidade;
        this.material = material;
        this.formato = formato;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public void beber() {
        System.out.println("Bebendo água da garrafa...");
    }
    public void encher() {
        System.out.println("Enchendo a garrafa de água...");
    }
    public void esvaziar() {
        System.out.println("Esvaziando a garrafa de água...");
    }
}
