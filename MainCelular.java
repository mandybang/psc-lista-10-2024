public class MainCelular {
    public static void main(String[] args) {
        Celular celular = new Celular("Sanrio Friends", "Flip", "Roxo", 2.10);

        celular.ligar();
        System.out.println("O celular de brinquedo que eu possuo é da marca " + celular.getMarca());
    }
    
}
