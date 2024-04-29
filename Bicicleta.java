public class Bicicleta {
    private String tipo;
    private int tamanhoRodas;
    private int numeroMarchas;

    public Bicicleta(String tipo, int tamanhoRodas, int numeroMarchas) {
        this.tipo = tipo;
        this.tamanhoRodas = tamanhoRodas;
        this.numeroMarchas = numeroMarchas;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public int getTamanhoRodas(){
        return tamanhoRodas;
    }
    public void setTamanhoRodas(int tamanhoRodas){
        this.tamanhoRodas = tamanhoRodas;
    }
    public int getNumeroMarchas(){
        return numeroMarchas;
    }
    public void setNumeroMarchas(int numeroMarchas){
        this.numeroMarchas =  numeroMarchas;
    }

    public void pedalar() {
       System.out.println("Alguém está pedalando.");
    }

    public void frear() {
        System.out.println("Bicicleta teve que ser freada.");
    }

    public void ajustarMarcha() {
        System.out.println("Troca de marcha realizada");
      
    }
}