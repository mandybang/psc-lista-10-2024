public class MainCaneta {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Preto", "Gel", "Plastico");

        caneta.escrever();
        System.out.println("A cor da caneta que pode ser usada no ENEM é " + caneta.getCorTinta());
    }
    
}
