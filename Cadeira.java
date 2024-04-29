public class Cadeira {
    public String material;
    public String cor;
    public double altura;
    public int peso;

    public Cadeira (String material, String cor, double altura, int peso) {
        this.material = material;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void sentar() {
        System.out.println("Alguém sentou na cadeira.");
    }
    public void empilhar(){
        System.out.println("Alguém empilhou a cadeira!");
    }
    public void mover(){
        System.out.println("Alguém moveu a cadeira de lugar!");
    }



}