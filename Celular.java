public class Celular {
    private String marca;
    private String modelo;
    private String cor;
    private double tamanhoTela;

 
    public Celular(String marca, String modelo, String cor, double tamanhoTela) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tamanhoTela = tamanhoTela;
    }

    public String getMarca (){
        return marca;       
    }
    public void setMarca (String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public double getTamanhoTela (){
        return tamanhoTela;
    }
    public void setTamanhoTela (double tamanhoTela){
        this.tamanhoTela = tamanhoTela;
    }

    public void ligar() {
        System.out.println("Ay, ay, ay\r\n" + //
                        "I'm your little butterfly");
      
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Hello Kitty - send me mensage");
        
    }

    public void tirarFoto() {
        System.out.println("FLASH");
        
    }

}