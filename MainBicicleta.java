public class MainBicicleta {
    public static void main(String[] args) {
    Bicicleta bicicleta = new Bicicleta("Esportiva", 15, 5);
    
    bicicleta.frear();
    System.out.println("O tamanho da roda da bicicleta é " + bicicleta.getTamanhoRodas());
    
    }
}